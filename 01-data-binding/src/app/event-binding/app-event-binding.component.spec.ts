import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppEventBindingComponent } from './app-event-binding.component';

describe('AppEventBindingComponent', () => {
  let component: AppEventBindingComponent;
  let fixture: ComponentFixture<AppEventBindingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppEventBindingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppEventBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
