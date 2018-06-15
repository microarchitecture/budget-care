import { TestBed, inject } from '@angular/core/testing';

import { BudgetMainService } from './budget-main.service';

describe('BudgetMainService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [BudgetMainService]
    });
  });

  it('should be created', inject([BudgetMainService], (service: BudgetMainService) => {
    expect(service).toBeTruthy();
  }));
});
