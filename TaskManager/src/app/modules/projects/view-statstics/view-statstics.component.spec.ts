import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewStatsticsComponent } from './view-statstics.component';

describe('ViewStatsticsComponent', () => {
  let component: ViewStatsticsComponent;
  let fixture: ComponentFixture<ViewStatsticsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewStatsticsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewStatsticsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
