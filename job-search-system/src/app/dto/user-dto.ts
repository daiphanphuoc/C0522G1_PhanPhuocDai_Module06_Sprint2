import {IRole} from '../model/i-role';

export class UserDto {
  username?: string;
  password?: string;
  roles?: IRole[];
}
