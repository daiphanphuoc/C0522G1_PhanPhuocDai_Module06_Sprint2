import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BoxSearchJobComponent } from './box-search-job.component';

describe('BoxSearchJobComponent', () => {
  let component: BoxSearchJobComponent;
  let fixture: ComponentFixture<BoxSearchJobComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BoxSearchJobComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BoxSearchJobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
