import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BudgetMenuComponent } from './budget-menu.component';

describe('BudgetMenuComponent', () => {
  let component: BudgetMenuComponent;
  let fixture: ComponentFixture<BudgetMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BudgetMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BudgetMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
