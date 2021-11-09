import { Component, OnInit } from '@angular/core';
import {Tour} from '../../entity/tour';
import {TourServiceService} from '../../service/tour-service.service';

@Component({
  selector: 'app-tour-list',
  templateUrl: './tour-list.component.html',
  styleUrls: ['./tour-list.component.css']
})
export class TourListComponent implements OnInit {
  id: number;
  name: string;
  tourList: Tour[] = [];
  constructor(private tourServiceService: TourServiceService) {
    tourServiceService.list().subscribe(next =>
    this.tourList = next);
    console.log(this.tourList);
  }

  ngOnInit(): void {
  }

  click(id: number, name: string) {
    this.id = id;
    this.name = name;
  }
}
