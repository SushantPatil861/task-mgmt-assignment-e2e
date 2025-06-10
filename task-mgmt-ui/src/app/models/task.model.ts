export interface Task {
  id?: string;
  title: string;
  description?: string;
  dueDate: string; // ISO format: yyyy-MM-dd
  priority: 'LOW' | 'MEDIUM' | 'HIGH';
  completed: boolean;
}
