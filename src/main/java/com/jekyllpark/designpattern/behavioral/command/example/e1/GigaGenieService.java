package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class GigaGenieService {
    public static void main(String[] args) {
        TvOnCommand tvOnCommand = new TvOnCommand(new SamsungTV());
        LightOnCommand lightOnCommand = new LightOnCommand(new LivingRoomLight());
        GigaGenieV2 genieV2 = new GigaGenieV2();
        genieV2.setCommand(tvOnCommand);
        genieV2.talk();
        System.out.println("----------------------");
        genieV2.setCommand(lightOnCommand);
        genieV2.talk();
    }
}
