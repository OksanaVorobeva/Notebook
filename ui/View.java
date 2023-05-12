package ui;

import presenter.Presenter;

public interface View {

  public void start();

  public void print(String text);

  public void setPresenter(Presenter presenter);

  public void addRecords();

  public void exit();

  public void printNote();

  public void save();

  public void read();
  

}