import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BudgetSidebarComponent } from './budget-sidebar.component';

describe('BudgetSidebarComponent', () => {
  let component: BudgetSidebarComponent;
  let fixture: ComponentFixture<BudgetSidebarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BudgetSidebarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BudgetSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
