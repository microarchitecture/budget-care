import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BudgetContentComponent } from './budget-content.component';

describe('BudgetContentComponent', () => {
  let component: BudgetContentComponent;
  let fixture: ComponentFixture<BudgetContentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BudgetContentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BudgetContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
