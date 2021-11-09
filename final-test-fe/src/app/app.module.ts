import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TourCreateComponent } from './tour/tour-create/tour-create.component';
import {ReactiveFormsModule} from '@angular/forms';
import { TourListComponent } from './tour/tour-list/tour-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TourCreateComponent,
    TourListComponent
  ],
    imports: [
        HttpClientModule,
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
