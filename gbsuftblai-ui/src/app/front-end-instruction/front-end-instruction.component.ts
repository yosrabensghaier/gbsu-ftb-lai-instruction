import { Component, OnInit } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';

@Component({
  selector: 'app-front-end-instruction',
  templateUrl: './front-end-instruction.component.html'
})
export class FrontEndInstructionComponent implements OnInit {

  instructions: ItemWithPath[] = [
    {text: 'Complete the nav-bar in order to navigate to the gbsu-ftb-lai component', path: '/assets/nav-bar.png'},
    {text: 'Complete the gbsu-ftb-lai form component to get a number as input and send this input to gbsu-ftb-lai service', path: '/assets/form.png'},
    {text: 'Complete the gbsu-ftb-lai service in order to call the rest service declare in gbsuftblai-back', path: '/assets/rest-service.png'},
    {text: 'Complete the gbsu-ftb-lai component in order to display the results of already converted number', path: '/assets/result.png'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
