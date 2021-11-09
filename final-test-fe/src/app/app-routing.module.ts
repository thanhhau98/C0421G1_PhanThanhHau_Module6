import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TourCreateComponent} from './tour/tour-create/tour-create.component';
import {TourListComponent} from './tour/tour-list/tour-list.component';


const routes: Routes = [
  {
    path: 'tour/create', component: TourCreateComponent,
  },
  {
    path: 'tour/list', component: TourListComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
