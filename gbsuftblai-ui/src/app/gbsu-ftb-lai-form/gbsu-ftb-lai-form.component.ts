import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';


@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  @Output() submitNumberOutput = new EventEmitter();
  converterForm: FormGroup;

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) {

  }

  ngOnInit(): void {
    this.converterForm = new FormGroup({
      'inputNumber': new FormControl('', [Validators.required, Validators.min(0)])
    })
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.converterForm.controls['inputNumber'].value);
    this.converterForm.controls['inputNumber'].setValue('');
  }

}
