import {TourType} from './tour-type';
import {Scope} from './scope';
import {Member} from './member';

export interface Tour {
  id: number;
  name: string;
  location: string;
  startDate: string;
  returnDay: string;
  registrationEndDate: string;
  maxOfMember: number;
  calendar: string;
  request: string;
  cost: number;
  tourType: TourType;
  scope: Scope;
  member: Member;
}
