import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BudgetMainRoutingModule } from './budget-main-routing.module';
import { BudgetSidebarComponent } from './budget-sidebar/budget-sidebar.component';
import { BudgetMenuComponent } from './budget-menu/budget-menu.component';
import { BudgetContentComponent } from './budget-content/budget-content.component';

@NgModule({
  imports: [
    CommonModule,
    BudgetMainRoutingModule
  ],
  declarations: [BudgetSidebarComponent, BudgetMenuComponent, BudgetContentComponent]
})
export class BudgetMainModule { }
