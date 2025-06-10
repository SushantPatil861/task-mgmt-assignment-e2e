import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UpcomingTasksComponent } from './upcoming-tasks/upcoming-tasks.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [UpcomingTasksComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'my-app';
}
