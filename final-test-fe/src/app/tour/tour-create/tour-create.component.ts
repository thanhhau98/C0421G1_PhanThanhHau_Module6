import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TourType} from '../../entity/tour-type';
import {Scope} from '../../entity/scope';
import {Member} from '../../entity/member';
import {TourServiceService} from '../../service/tour-service.service';

@Component({
  selector: 'app-tour-create',
  templateUrl: './tour-create.component.html',
  styleUrls: ['./tour-create.component.css']
})
export class TourCreateComponent implements OnInit {
  createForm: FormGroup = new FormGroup(
    {
      id: new FormControl(),
      name: new FormControl(),
      location: new FormControl(),
      startDate: new FormControl(),
      returnDay: new FormControl(),
      registrationEndDate: new FormControl(),
      maxOfMember: new FormControl(),
      calendar: new FormControl(),
      request: new FormControl(),
      cost: new FormControl(),
      tourType: new FormControl(),
      scope: new FormControl(),
      member: new FormControl()
    }
  );

  validationCreateForm = {
    location: [
      {type: 'required', message: 'Mật khẩu không được để trống.'},
      {type: 'minlength', message: 'Mật khẩu không ít hơn 4 ký tự.'},
      {type: 'maxlength', message: 'Mật khẩu không vượt quá 30 ký tự.'},
      {type: 'pattern', message: 'Mật khẩu chỉ được nhập chữ cái in hoa, chữ cái và số.'}
    ]
  };

  constructor(private tourService: TourServiceService) { }

  ngOnInit(): void {
  }
  submit() {
    const value = this.createForm.value;
    this.tourService.create(value).subscribe();
  }
}
