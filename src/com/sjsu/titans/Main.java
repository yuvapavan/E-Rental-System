package com.sjsu.titans;

import com.sjsu.titans.User.Admin;
import com.sjsu.titans.User.Customer;
import com.sjsu.titans.device.*;
import com.sjsu.titans.Plan.*;


public class Main {


    public static void main(String[] args) {

    /* References to demonstrate the functionality*/
      Admin admin = createAdmin();
      Customer customer1 = createCustomer();
      Device acer = createAcer();
      Device apple = createApple();
      Device sony = createSony();
      Device hp = createHP();
      Device galaxy = createGalaxy();
      Device kindle = createKindle();
      Device ipad = createIPad();
      RentalPlan elitePlan= PlanFactory.getRentalPlan(PlanFactory.RENTAL_PLAN_TYPE.RENTAL_PLAN_TYPE_ELITE);
      Cart cart=new Cart(1,customer1);



      System.out.println("***************************************************************************************");
      System.out.println("Listing the Functions of Admin");
      admin.authenthicateUser();
      System.out.println("***************************************************************************************");

      System.out.println("\n Adding different laptaps to the System");
      addDevices(admin, new Device[]{acer, apple, hp, sony});


      System.out.println("\n Adding different tablets to the System");
      //adding 3 tablet categories to the system
      addDevices(admin, new Device[]{ipad, galaxy, kindle});
      System.out.println("***************************************************************************************");

      // updating 3 tablet categories in the system
      System.out.println("Update Tablet Functionality for Admin");
      addDevices(admin, new Device[]{ipad, galaxy, kindle});
      System.out.println("***************************************************************************************");


      // deleting 4 laptop categories from the system
      System.out.println("Delete Laptop Functionality for Admin");
      deleteDevices(admin, new Device[]{acer, apple, hp, sony});
      System.out.println("***************************************************************************************");


      // track device status
      System.out.println("ADMIN : Track Device Status  ");
      admin.trackDevice(acer);

      //Review Feedback
      System.out.println("ADMIN : Review Feedback  ");
      admin.reviewFeedback();

      //logging out from admin
      admin.logoutUser();

      //Registration and Authenthication Process of Customer
      //Customer Selects an Elite Plan
      customer1.registerUser();
      customer1.authenthicateUser();
      customer1.subscribeToRentalPlan(elitePlan);



      // Adding Laptop and Tablet to the cart
      System.out.println("Adding Laptops and Tablets to the Cart ");
      cart.addDevice(acer,1);
      cart.addDevice(apple,1);
      System.out.println("***************************************************************************************");


//      //Deleting acer and Kindle Tablet from the cart
      System.out.println("Deleting Acer and Kindle from the Cart ");
      cart.deleteDevice(acer);
      System.out.println("***************************************************************************************");


//      //Updating Quantities of Devices of sony and galaxy
      System.out.println("Updating Laptops and Tablets in the Cart ");
      cart.updateQuantity(acer,3);
//      cart.updateQuantity(apple,2);
      System.out.println("***************************************************************************************");
      RentHandler rentHandler = new RentHandler(customer1);
      rentHandler.finishOrder(cart);


      System.out.println("\n***************************************************************************************");
      System.out.println("ADMIN:  Process Return ");
      RentHandler rentHandler2 = new RentHandler(admin);
      rentHandler2.processReturn(apple);


      System.out.println("\n***************************************************************************************");
      acer.issueDevice();
      System.out.println("CUSTOMER:  Feedback submission ");
      customer1.submitFeedback(acer, "Performnace is not good");

      System.out.println("\n***************************************************************************************");
      System.out.println("CUSTOMER: Submit support ticket ");
      ipad.issueDevice();
      ipad.returnDevice();
      ipad.repairDevice();
      customer1.submitTicket(ipad, "Very slow");


    }


    public static Admin createAdmin() {
      return new Admin(2,"Mani@gmail.com","Mani","Kumar","Santa Clara");
    }

    public  static Customer createCustomer() {
      return new Customer(1,"pavan@gmail.com","yuva","pavan","sanjose");
    }


  public  static Device createAcer() {
    return  new Acer(1,"Laptop",100,"Black","avialbleState",2017,80,8);
  }

  public  static Device createApple() {
    return new Apple(2,"Laptop",100,"White","avialbleState",2016,120,16);
  }

  public  static Device createSony() {
    return new Sony(3,"Laptop",100,"Blue","avialbleState",2015,160,32);
  }

  public  static Device createHP() {
    return new HP(4,"Laptop",100,"Red","avialbleState",2014,240,64);
  }

  public  static Device createGalaxy() {
    return  new Galaxy(5,"Tablet",100,"Black","avialbleState",2014,16,8);
  }

  public  static Device createKindle() {
    return  new Kindle(6,"Tablet",100,"White","avialbleState",2015,4,4);
  }

  public  static Device createIPad() {
    return  new iPad(7,"Tablet",100,"Blue","avialbleState",2016,16,8);
  }

    public  static void addDevices(Admin admin, Device[] devices) {
      //adding 4 laptop categories to the system
      for (int i = 0; i < devices.length; i++) {
        admin.addDevice(devices[i]);
      }
      System.out.println("***************************************************************************************");
    }

  public  static void updateDevices(Admin admin, Device[] devices) {
    //update
    for (int i = 0; i < devices.length; i++) {
      admin.updateDevice(devices[i]);
    }
    System.out.println("***************************************************************************************");
  }

  public  static void deleteDevices(Admin admin, Device[] devices) {
    //adding 4 laptop categories to the system
    for (int i = 0; i < devices.length; i++) {
      admin.deleteDevice(devices[i]);
    }
    System.out.println("***************************************************************************************");
  }



}


