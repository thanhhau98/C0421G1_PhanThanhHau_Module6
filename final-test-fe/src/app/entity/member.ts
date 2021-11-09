import {Tour} from './tour';

export interface Member {
  id: number;
  name: string;
  dateOfBirth: string;
  address: string;
  email: string;
  phone: string;
  gender: number;
  tour: Tour[];
}
