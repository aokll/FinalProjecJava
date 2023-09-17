package Presenter;

import Model.Service;

public class Present {
   private Service service;

    public Present() {
        this.service = new Service();
    }
    public void put(int i){
        service.put(i);
    }
    public void get() throws Exception {
        service.get();
    }
}
