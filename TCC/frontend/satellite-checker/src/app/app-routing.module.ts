import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { SettingspageComponent } from './settingspage/settingspage.component';


const routes: Routes = [
   { path: 'home', component: HomepageComponent },
   { path: 'dashboard', component: DashboardComponent },
   { path: 'settings', component: SettingspageComponent },
   { path: 'login', component: LoginpageComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
