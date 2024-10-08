package com.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

    @Autowired
    private CPU cpu;

    @Autowired
    private RAM ram;
    public Computer(RAM ram){
        this.ram = ram;
    }

    @Autowired
    public SSD ssd;
    public void setSsd(SSD ssd){
        this.ssd = ssd;
    }

    public void show(){
        cpu.show();
        ram.show();
        ssd.show();
    }
}
