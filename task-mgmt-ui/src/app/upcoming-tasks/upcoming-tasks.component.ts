import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { TaskService } from '../task.service';
import { Task } from '../models/task.model';

@Component({
  selector: 'app-upcoming-tasks',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './upcoming-tasks.component.html',
})
export class UpcomingTasksComponent implements OnInit {
  tasks: Task[] = [];
  selectedPriority: string = '';

  constructor(private taskService: TaskService) {}

  ngOnInit() {
    this.loadTasks();
  }

  loadTasks() {
    // change dueBefore to some future date
    this.taskService.getTasks({ dueBefore: new Date().toISOString().split('T')[0], priority: this.selectedPriority })
      .subscribe(data => this.tasks = data);
  }

  onPriorityChange() {
    this.loadTasks();
  }
}
