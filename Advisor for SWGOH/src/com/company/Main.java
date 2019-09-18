package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initializing events
        Event e1 = new Event();
        e1.setEventName("Emperor's Demise");
        e1.setReward("Emperor Palpatine");
        e1.setRotation(72);
        e1.setReqGear(7);
        e1.setRecGear(9);
        e1.reqChars[0] = "Ezra Bridger";
        e1.reqChars[1] = "Chopper";
        e1.reqChars[2] = "Garazeb \"Zeb\" Orrelios";
        e1.reqChars[3] = "Hera Syndulla";
        e1.reqChars[4] = "Kanan Jarrus";

        Event e2 = new Event();
        e2.setEventName("Grandmaster's Training");
        e2.setReward("Grandmaster Yoda");
        e2.setRotation(67);
        e2.setReqGear(8);
        e2.setRecGear(9);
        e2.reqChars[0] = "Ezra Bridger";
        e2.reqChars[1] = "Kanan Jarrus";
        e2.reqChars[2] = "Obi-Wan Kenobi (Old Ben)";
        e2.reqChars[3] = "Bastilla Shan";
        e2.reqChars[4] = "Jolee Bindo";

        Event e3 = new Event();
        e3.setEventName("Luke Skywalker Hero's Journey");
        e3.setReward("Commander Luke Skywalker");
        e3.setRotation(102);
        e3.setReqGear(7);
        e3.setRecGear(9);
        e3.reqChars[0] = "Luke Skywalker (Farmboy)";
        e3.reqChars[1] = "Obi-Wan Kenobi (Old Ben)";
        e3.reqChars[2] = "Princess Leia";
        e3.reqChars[3] = "R2-D2";
        e3.reqChars[4] = "Stormtrooper Han";

        Event e4 = new Event();
        e4.setEventName("Legend of the Old Republic");
        e4.setReward("Jedi Knight Revan");
        e4.setRotation(89);
        e4.setReqGear(7);
        e4.setRecGear(10);
        e4.reqChars[0] = "Bastilla Shan";
        e4.reqChars[1] = "Jolee Bindo";
        e4.reqChars[2] = "Zaalbar";
        e4.reqChars[3] = "Mission Vao";
        e4.reqChars[4] = "T3-M4";

        Event e5 = new Event();
        e5.setEventName("Scourge of the Old Republic");
        e5.setReward("Darth Revan");
        e5.setRotation(80);
        e5.setReqGear(9);
        e5.setRecGear(10);
        e5.reqChars[0] = "Carth onasi";
        e5.reqChars[1] = "HK-47";
        e5.reqChars[2] = "Juhani";
        e5.reqChars[3] = "Canderous";
        e5.reqChars[4] = "Bastilla Shan (Fallen)";

        Event e6 = new Event();
        e6.setEventName("Pieces & Plans");
        e6.setReward("BB-8");
        e6.setRotation(82);
        e6.setReqGear(7);
        e6.setRecGear(9);
        e6.reqChars[0] = "Kylo Ren (Unmasked)";
        e6.reqChars[1] = "Kylo Ren";
        e6.reqChars[2] = "First Order TIE Pilot";
        e6.reqChars[3] = "First Order Executioner";
        e6.reqChars[4] = "First Order Officer";

        Event e7 = new Event();
        e7.setEventName("Rey\'s Hero\'s Journey");
        e7.setReward("Rey (Jedi Training)");
        e7.setRotation(97);
        e7.setReqGear(7);
        e7.setRecGear(9);
        e7.reqChars[0] = "Finn";
        e7.reqChars[1] = "Rey (Scavenger)";
        e7.reqChars[2] = "BB-8";
        e7.reqChars[3] = "Veteran Smuggler Han Solo";
        e7.reqChars[4] = "Veteran Smuggler Chewbacca";

        Event e8 = new Event();
        e8.setEventName("Contact Protocol");
        e8.setReward("C-3PO");
        e8.setRotation(87);
        e8.setReqGear(9);
        e8.setRecGear(11);
        e8.reqChars[0] = "Chief Chirpa";
        e8.reqChars[1] = "Ewok Elder";
        e8.reqChars[2] = "Logray";
        e8.reqChars[3] = "Wicket";
        e8.reqChars[4] = "Paploo";

        Event e9 = new Event();
        e9.setEventName("Daring Droid");
        e9.setReward("R2-D2");
        e9.setRotation(81);
        e9.setReqGear(8);
        e9.setRecGear(9);
        e9.reqChars[0] = "Emperor Palpatine";
        e9.reqChars[1] = "Darth Vader";
        e9.reqChars[2] = "Grand Admiral Thrawn";
        e9.reqChars[3] = "Grand Moff Tarkin";
        e9.reqChars[4] = "Royal Guard";

        Event e10 = new Event();
        e10.setEventName("Aggressive Negotiations");
        e10.setReward("Padme Amidala");
        e10.setRotation(97);
        e10.setReqGear(10);
        e10.setRecGear(12);
        e10.reqChars[0] = "Count Dooku";
        e10.reqChars[1] = "Nute Gunray";
        e10.reqChars[2] = "Jango Fett";
        e10.reqChars[3] = "Poggle The Lesser";
        e10.reqChars[4] = "Sun Fac";

        Event e11 = new Event();
        e11.setEventName("Star Forge Showdown");
        e11.setReward("Darth Malak");
        e11.setRotation(125);
        e11.setReqGear(9);
        e11.setRecGear(12);
        e11.reqChars[0] = "Darth Revan";
        e11.reqChars[1] = "Jedi Knight Revan";
        e11.reqChars[2] = "Zaalbar";
        e11.reqChars[3] = "Mission Vao";
        e11.reqChars[4] = "Bastilla Shan (Fallen)";

        Event e12 = new Event();
        e12.setEventName("One Famous Wookiee");
        e12.setReward("Chewbacca");
        e12.setRotation(93);
        e12.setReqGear(11);
        e12.setRecGear(12);
        e12.reqChars[0] = "Bossk";
        e12.reqChars[1] = "Boba Fett";
        e12.reqChars[2] = "Jango Fett";
        e12.reqChars[3] = "Dengar";
        e12.reqChars[4] = "Greedo";

        Event e13 = new Event();
        e13.setEventName("Artist of War");
        e13.setReward("Grand Admiral Thrawn");
        e13.setRotation(80);
        e13.setReqGear(7);
        e13.setRecGear(9);
        e13.reqChars[0] = "Ezra Bridger";
        e13.reqChars[1] = "Hera Syndulla";
        e13.reqChars[2] = "Kanan Jarrus";
        e13.reqChars[3] = "Garazeb \"Zeb\"Zeb Orrelios";
        e13.reqChars[4] = "Chopper";

        int operation;
        int loop = 0;
        int choise;
        int op;

        while(loop!=-1){
            System.out.print("\n1 - Event Checklist\n2 - Panic Farm\n3 - Counter Teams\n");
            System.out.print("\nChoose operation: ");
            Scanner sc1 = new Scanner(System.in);
            operation = sc1.nextInt();

            switch(operation){
                case 1:
                    System.out.print("\nChoose an event below:\n" +
                            "1 - Emperor's Demise\n" +
                            "2 - Grandmaster's Training\n" +
                            "3 - Luke Skywalker Hero's Journey\n" +
                            "4 - Legend of the Old Republic\n" +
                            "5 - Scourge of the Old Republic\n" +
                            "6 - Pieces & Plans\n" +
                            "7 - Rey's Hero's Journey\n" +
                            "8 - Contact Protocol\n" +
                            "9 - Daring Droid\n" +
                            "10 - Aggressive Negotiations\n" +
                            "11 - Star Forge Showdown\n" +
                            "12 - One Famous Wookiee\n" +
                            "13 - Atrist of War\n");
                    System.out.print("Choise: ");
                    Scanner sc2 = new Scanner(System.in);
                    choise = sc2.nextInt();

                    switch(choise){
                        case 1:
                            eChecklist(e1);
                            break;
                        case 2:
                            eChecklist(e2);
                            break;
                        case 3:
                            eChecklist(e3);
                            break;
                        case 4:
                            eChecklist(e4);
                            break;
                        case 5:
                            eChecklist(e5);
                            break;
                        case 6:
                            eChecklist(e6);
                            break;
                        case 7:
                            eChecklist(e7);
                            break;
                        case 8:
                            eChecklist(e8);
                            break;
                        case 9:
                            eChecklist(e9);
                            break;
                        case 10:
                            eChecklist(e10);
                            break;
                        case 11:
                            eChecklist(e11);
                            break;
                        case 12:
                            eChecklist(e12);
                            break;
                        case 13:
                            eChecklist(e13);
                            break;
                        default:
                            System.out.print("\nInvalid choise! Retry again.\n");
                            loop = 0;
                            break;
                    }

                    //Checking nested switch-case statement's default case
                    if(loop==0)
                        loop = 0;
                    else
                        loop = -1;
                    break;

                case 2:
                    System.out.print("\nChoose an event below:\n" +
                            "1 - Emperor's Demise\n" +
                            "2 - Grandmaster's Training\n" +
                            "3 - Luke Skywalker Hero's Journey\n" +
                            "4 - Legend of the Old Republic\n" +
                            "5 - Scourge of the Old Republic\n" +
                            "6 - Pieces & Plans\n" +
                            "7 - Rey's Hero's Journey\n" +
                            "8 - Contact Protocol\n" +
                            "9 - Daring Droid\n" +
                            "10 - Aggressive Negotiations\n" +
                            "11 - Star Forge Showdown\n" +
                            "12 - One Famous Wookiee\n" +
                            "13 - Atrist of War\n");
                    System.out.print("Choise: ");
                    Scanner sc3 = new Scanner(System.in);
                    choise = sc3.nextInt();

                    switch(choise){
                        case 1:
                            pFarm(e1);
                            break;
                        case 2:
                            pFarm(e2);
                            break;
                        case 3:
                            pFarm(e3);
                            break;
                        case 4:
                            pFarm(e4);
                            break;
                        case 5:
                            pFarm(e5);
                            break;
                        case 6:
                            pFarm(e6);
                            break;
                        case 7:
                            pFarm(e7);
                            break;
                        case 8:
                            pFarm(e8);
                            break;
                        case 9:
                            pFarm(e9);
                            break;
                        case 10:
                            pFarm(e10);
                            break;
                        case 11:
                            pFarm(e11);
                            break;
                        case 12:
                            pFarm(e12);
                            break;
                        case 13:
                            pFarm(e13);
                            break;
                        default:
                            System.out.print("\nInvalid choise! Retry again.\n");
                            loop = 0;
                            break;
                    }

                    //Checking nested switch-case statement's default case
                    if(loop==0)
                        loop = 0;
                    else
                        loop = -1;
                    break;

                case 3:
                    counters();
                    break;

                default:
                    System.out.print("\nInvalid choise! Retry again.\n");
                    loop = 0;
                    continue;
            }

            System.out.print("\nTo continue: 1\n" +
                    "Close the app: 0\n");
            System.out.print("Action: ");
            Scanner sc4 = new Scanner(System.in);
            op = sc4.nextInt();

            if(op==1){
                System.out.print("\n--------------------\n");
                loop = 0;
            }
            else if(op==0)
                loop = -1;
            else{
                System.out.print("\nWrong choise! Application will be closed.\n\n");
                loop = -1;
            }
        }
    }

    static void eChecklist(Event event) {

        System.out.print("\nEvent: " + event.getEventName() +
                "\nRequired Characters: " + event.reqChars[0] + " --- " + event.reqChars[1] + " --- " + event.reqChars[2] + " --- " + event.reqChars[3] + " --- " + event.reqChars[4] +
                "\nRequired Gear: Gear " + event.getReqGear() +
                "\nRecommended Gear: " + event.getRecGear() +
                "\nReward: " + event.getReward() + "\n");
        System.out.print("\n**Note that some events offer more than 5 characters to use for that event. The ones that are shown here\n" +
                "are the most beneficial and easy farmable 5 characters for the specified event.**.\n");

    }

    static void pFarm(Event event) {

        int[] stars = new int[5];
        int[] shards = new int[5];
        int[] sLeft = new int[5];
        float[] dBasis = new float[5];
        int days;

        System.out.print("\nEvent name: " + event.getEventName() + "\nReward: " + event.getReward() + "\nAverage rotation: " + event.getRotation() + "\n");
        System.out.print("When was the event last launched?\nDays: ");
        Scanner sc5 = new Scanner(System.in);
        event.setLastDate(sc5.nextInt());

        Scanner sc6 = new Scanner(System.in);
        Scanner sc7 = new Scanner(System.in);
        Scanner sc8 = new Scanner(System.in);
        Scanner sc9 = new Scanner(System.in);
        Scanner sc10 = new Scanner(System.in);

        //Stars
        System.out.print("\nHow many stars do you have on your characters?\n");
        System.out.print("1st Character: ");
        stars[0] = sc6.nextInt();
        System.out.print("2nd Character: ");
        stars[1] = sc7.nextInt();
        System.out.print("3rd Character: ");
        stars[2] = sc8.nextInt();
        System.out.print("4th Character: ");
        stars[3] = sc9.nextInt();
        System.out.print("5th Character: ");
        stars[4] = sc10.nextInt();

        Scanner sc11 = new Scanner(System.in);
        Scanner sc12 = new Scanner(System.in);
        Scanner sc13 = new Scanner(System.in);
        Scanner sc14 = new Scanner(System.in);
        Scanner sc15 = new Scanner(System.in);

        //Shards
        System.out.print("\nHow many shards do you have on your characters?\n");
        System.out.print("1st Character: ");
        shards[0] = sc11.nextInt();
        System.out.print("2nd Character: ");
        shards[1] = sc12.nextInt();
        System.out.print("3rd Character: ");
        shards[2] = sc13.nextInt();
        System.out.print("4th Character: ");
        shards[3] = sc14.nextInt();
        System.out.print("5th Character: ");
        shards[4] = sc15.nextInt();

        for(int i=0; i<=4; i++){

            switch (stars[i]){
                case 1:
                    sLeft[i] = 320;
                    break;
                case 2:
                    sLeft[i] = 305;
                    break;
                case 3:
                    sLeft[i] = 280;
                    break;
                case 4:
                    sLeft[i] = 250;
                    break;
                case 5:
                    sLeft[i] = 185;
                    break;
                case 6:
                    sLeft[i] = 100;
                    break;
                default:
                    sLeft[i] = 0;
            }

            sLeft[i] -= shards[i];
        }

        //Time approximation
        if(event.getRotation() >= event.getLastDate())
            days = (event.getRotation() - event.getLastDate()) + 7;
        else
            days = 0;

        //Different if statement from the previous one
        if(days > 0)
            System.out.print("\n\n" + event.getEventName() + " event will start around " + (days-7) + " days later. You have " + days + " days to farm.\n");
        else
            System.out.print("\n\n" + event.getEventName() + " event has already exceeded its average rotation time. It should launch soon.\n");

        //Daily shard requirements
        for(int j=0; j<=4; j++)
            dBasis[j] = (float) sLeft[j] / days;

        System.out.print("Your shard requirements on daily basis are:\n");
        System.out.print("1st Character: " + dBasis[0] +
                "\n2nd Character: " + dBasis[1] +
                "\n3rd Character: " + dBasis[2] +
                "\n4th Character: " + dBasis[3] +
                "\n5th Character: " + dBasis[4] + "\n");
    }

    static void counters() {

        int tier;
        int team;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        System.out.print("\n\n**As a rule of a thumb, higher Tier level squads counter most lower Tier level squads on offense**\n");

        while(count1!=1){

            System.out.print("\nSelect a Tier: " +
                    "\nTier 3 = Type 3" +
                    "\nTier 2 = Type 2" +
                    "\nTier 1 = Type 1" +
                    "\nTier Meta = Type 0" +
                    "\nTier: ");
            Scanner sc16 = new Scanner(System.in);
            tier = sc16.nextInt();

            if(tier==0 || tier==1 || tier==2 || tier==3){

                switch(tier){

                    case 0:
                        while(count2!=1){
                            System.out.print("\nTier Meta Teams List:\n" +
                                    "1 - Sith Empire\n" +
                                    "2 - Single Parent Sith Empire\n" +
                                    "3 - Jedi Knight Revan\n" +
                                    "Find out counters for team: ");
                            Scanner sc17 = new Scanner(System.in);
                            team = sc17.nextInt();

                            if(team==1 || team==2 || team==3){

                                switch(team){
                                    case 1:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Darth Revan\n" +
                                                "OTHERS    -> Darth Malak --- Bastilla Shan (Fallen) --- HK-47\n" +
                                                "OPTIONALS -> Sith Trooper --- Sith Marauder --- Sith Assassin\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Jedi Knight Revan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo --- Grand Admiral Thrawn\n" +
                                                "OPTIONALS -> Hermit Yoda --- Bastilla Shan\n" +
                                                "NOTES     -> Thrawn should be faster than enemy Bastilla Shan (Fallen)\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Padme Amidala\n" +
                                                "OTHERS    -> Jedi Knight Anakin --- General Kenobi --- Ahsoka Tano --- C-3PO\n" +
                                                "OPTIONALS -> Barriss Offee\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> IG-88\n" +
                                                "OTHERS    -> HK-47\n" +
                                                "OPTIONALS -> General Grievous --- T3-M4 --- BB-8 --- L3-37\n" +
                                                "NOTES     -> L3-37 can be replaced with Chopper\n");
                                        break;

                                    case 2:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Darth Revan\n" +
                                                "OTHERS    -> Bastilla Shan (Fallen) --- HK-47\n" +
                                                "OPTIONALS -> Sith Trooper --- Sith Marauder --- Sith Assassin --- Grand Admiral Thrawn\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Jedi Knight Revan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Padme Amidala\n" +
                                                "OTHERS    -> Jedi Knight Anakin --- General Kenobi --- Ahsoka Tano\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- C-3PO --- Chewbacca\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus --- Grand Admiral Thrawn\n\n");
                                        break;

                                    case 3:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Jedi Knight Revan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n" +
                                                "OPTIONALS -> General Kenobi --- Bastilla Shan --- Hermit Yoda --- Ezra Bridger\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus --- Grand Admiral Thrawn\n" +
                                                "NOTES     -> Be careful with Jedi Knight Revan lead speed bonus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Padme Amidala\n" +
                                                "OTHERS    -> Jedi Knight Anakin --- General Kenobi --- Ahsoka Tano --- C-3PO\n" +
                                                "OPTIONALS -> Barriss Offee\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Grievous\n" +
                                                "OTHERS    -> B1 Battle Droid --- B2 Super Battle Droid --- Droideka\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Nightsister Zombie --- Old Daka\n" +
                                                "OPTIONALS -> Talia --- Nightsister Spirit\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- R2-D2 --- Resistance Trooper --- Enfys Nest\n\n");
                                        break;

                                    default:
                                        System.out.print("\n\nInvalid choise! Try again.\n");
                                        break;
                                }

                                team = 0;
                                count2 = 1;
                            }
                            else{
                                System.out.print("\n\nInvalid choise! Try again.\n");
                                count2 = 0;
                            }
                        }

                        count1 = 1;
                        break;

                    case 1:
                        while(count3!=1){
                            System.out.print("\nTier 1 Teams List:\n" +
                                    "1 - Sith Triumvirate\n" +
                                    "2 - CLS Rebels\n" +
                                    "3 - Galactic Republic\n" +
                                    "4 - Separatist Droids\n" +
                                    "Find out counters for team: ");
                            Scanner sc18 = new Scanner(System.in);
                            team = sc18.nextInt();

                            if(team==1 || team==2 || team==3 || team==4){

                                switch(team){
                                    case 1:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n" +
                                                "OPTIONALS -> Any Sith --- Grand Admiral Thrawn\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca --- C-3PO\n" +
                                                "OPTIONALS -> R2-D2\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Knight Revan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper --- R2-D2\n\n");
                                        break;

                                    case 2:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n" +
                                                "OPTIONALS -> C-3PO --- R2-D2 --- Obi-Wan Kenobi (Old Ben)\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Nightsister Zombie --- Old Daka\n" +
                                                "OPTIONALS -> Talia --- Nightsister Spirit\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n" +
                                                "OPTIONALS -> Any Jedi\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        break;

                                    case 3:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Padme Amidala\n" +
                                                "OTHERS    -> Jedi Knight Anakin --- Ahsoka Tano --- General Kenobi\n" +
                                                "OPTIONALS -> Barriss Offee --- C-3PO --- Hermit Yoda\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> General Grievous\n" +
                                                "OTHERS    -> B1 Battle Droid --- B2 Super Battle Droid --- Droideka\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader --- Imperial Probe Droid\n" +
                                                "NOTES     -> Use this team if enemy doesn't have C-3PO\n\n");
                                        break;

                                    case 4:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> General Grievous\n" +
                                                "OTHERS    -> Droideka --- B1 Battle Droid --- B2 Super Battle Droid --- IG-100 MagnaGuard\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Padme Amidala\n" +
                                                "OTHERS    -> Jedi Knight Anakin --- General Kenobi --- Ahsoka Tano\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Knight Revan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca --- C-3PO\n" +
                                                "NOTES     -> Use this team only if enemy General Grievous is not G13\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "NOTES     -> Use this team only if enemy General Grievous is not G13\n\n");
                                        break;

                                    default:
                                        System.out.print("\n\nInvalid choise!. Try again.\n");
                                        break;
                                }

                                team = 0;
                                count3 = 1;
                            }
                            else{
                                System.out.print("\nInvalid choise! Try again.\n");
                                count3 = 0;
                            }
                        }

                        count1 = 1;
                        break;

                    case 2:
                        while(count4!=1){
                            System.out.print("\nTier 2 Teams List:\n" +
                                    "1 - Bounty Hunters\n" +
                                    "2 - Asajj Nightsisters\n" +
                                    "3 - Talzin Nightsisters\n" +
                                    "4 - First Order\n" +
                                    "5 - Old Republic\n" +
                                    "6 - Empire\n" +
                                    "7 - Scoundrels\n" +
                                    "8 - Bastilla Jedi\n" +
                                    "9 - Geonosians\n" +
                                    "10 - JTR Resistance\n" +
                                    "11 - Imperial Troopers\n" +
                                    "12 - Clone Troopers\n" +
                                    "Find out counters for team: ");
                            Scanner sc19 = new Scanner(System.in);
                            team = sc19.nextInt();

                            if(team==1 || team==2 || team==3 || team==4 || team==5 || team==6 ||
                                    team==7 || team==8 || team==9 || team==10 || team==11 || team==12){

                                switch(team){
                                    case 1:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Bossk\n" +
                                                "OTHERS    -> Boba Fett --- Jango Fett --- Dengar\n" +
                                                "OPTIONALS -> Any Bounty Hunter\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Snowtrooper\n" +
                                                "OPTIONALS -> Any Imperial Trooper\n" +
                                                "NOTES     -> Ability block Bossk before he taunts\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Kylo Ren (Unmasked)\n" +
                                                "OTHERS    -> Kylo Ren --- First Order Officer --- First Order Executioner\n" +
                                                "NOTES     -> Stun Bossk before he taunts\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Any Sith or Empire\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Any Jedi\n\n");
                                        break;

                                    case 2:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Asajj Ventress\n" +
                                                "OTHERS    -> Mother Talzin --- Old Daka --- Nightsister Zombie --- Enfys Nest\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader --- Grand Moff Tarkin --- Shoretrooper --- TIE Fighter Pilot\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jango Fett\n" +
                                                "OTHERS    -> Bossk --- Boba Fett\n" +
                                                "OPTIONALS -> Any Bounty Hunter\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Any Jedi\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> General Grievous\n" +
                                                "OTHERS    -> B1 Battle Droid --- B2 Super Battle Droid --- Droideka\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Shoretrooper --- Colonel Starck --- Death Trooper --- Range Trooper\n" +
                                                "NOTES     -> Be careful with Asajj lead speed bonus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 7\n");
                                        System.out.print("LEADER    -> Chief Chirpa\n" +
                                                "OTHERS    -> Ewok Elder\n" +
                                                "OPTIONALS -> Any Ewok\n" +
                                                "NOTES     -> Use this team only if enemy doesn't have Enfys Nest\n");
                                        break;

                                    case 3:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "OPTIONALS -> Talia --- Nightsister Spirit --- Nightsister Acolyte\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader --- Grand Moff Tarkin --- Shoretrooper --- TIE Fighter Pilot\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Bossk\n" +
                                                "OTHERS    -> Jango Fett --- Boba Fett --- Dengar\n" +
                                                "OPTIONALS -> Any Bounty Hunter\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Shoretrooper --- Colonel Starck --- Range Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Shaak Ti\n" +
                                                "OTHERS    -> Any Clone Troopers\n\n");
                                        break;

                                    case 4:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Kylo Ren (Unmasked)\n" +
                                                "OTHERS    -> Kylo Ren --- First Order Executioner\n" +
                                                "OPTIONALS -> First Order Officer --- First Order TIE Pilot --- First Order Stormtrooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Chief Chirpa\n" +
                                                "OTHERS    -> Any Ewok\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Shoretrooper --- Colonel Starck --- Range Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> CT-7567 \"Rex\"\n" +
                                                "OTHERS    -> Wampa\n" +
                                                "OPTIONALS -> Any Clone Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "OPTIONALS -> Any Nightsister\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 7\n");
                                        System.out.print("LEADER    -> General Grievous\n" +
                                                "OTHERS    -> B1 Battle Droid --- B2 Super Battle Droid --- Droideka\n\n");
                                        break;

                                    case 5:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Carth Onasi\n" +
                                                "OTHERS    -> Zaalbar --- Mission Vao --- Canderous Ordo --- Juhani\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n" +
                                                "OPTIONALS -> Any Jedi\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Kylo Ren (Unmasked)\n" +
                                                "OTHERS    -> Kylo Ren --- First Order Executioner --- First Order Officer\n" +
                                                "OPTIONALS -> Any First Order\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> CT-7567 \"Rex\"\n" +
                                                "OTHERS    -> Wampa\n" +
                                                "OPTIONALS -> Any Clone Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader --- Grand Moff Tarkin --- Grand Admiral Thrawn --- TIE Fighter Pilot\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 7\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Colonel Starck --- Snowtrooper\n\n");
                                        break;

                                    case 6:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Grand Admiral Thrawn --- Grand Moff Tarkin --- Imperial Probe Droid\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "OPTIONALS -> Any Nightsister\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Snowtrooper\n" +
                                                "OPTIONALS -> Any Imperial Trooper\n" +
                                                "NOTES     -> Ability block Darth Vader before he gets a turn\n\n");
                                        break;

                                    case 7:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Qi'ra\n" +
                                                "OTHERS    -> Enfys Nest --- Vandor Chewbacca --- L3-37\n" +
                                                "OPTIONALS -> Zaalbar --- Mission Vao --- Young Han Solo --- Young Lando Calrissian\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n" +
                                                "OPTIONALS -> Any Jedi\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Bossk\n" +
                                                "OTHERS    -> Jango Fett --- Dengar --- Boba Fett\n" +
                                                "OPTIONALS -> Any Bounty Hunter\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> TIE Fighter Pilot --- Grand Moff Tarkin --- Darth Vader\n" +
                                                "NOTES     -> If the enemy team is faster, add Grand Admiral Thrawn\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> Kylo Ren (Unmasked)\n" +
                                                "OTHERS    -> Kylo Ren --- First Order Executioner\n" +
                                                "OPTIONALS -> Any First Order\n\n");
                                        break;

                                    case 8:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Bastilla Shan\n" +
                                                "OTHERS    -> Grandmaster Yoda --- Jolee Bindo\n" +
                                                "OPTIONALS -> Any Jedi\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Enfys Nest\n" +
                                                "OTHERS    -> Up to your decision\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "OPTIONALS -> Any Nightsister\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 5\n");
                                        System.out.print("LEADER    -> Bossk\n" +
                                                "OTHERS    -> Jango Fett --- Dengar --- Boba Fett\n" +
                                                "OPTIONALS -> Any Bounty Hunter\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 6\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n\n");
                                        break;

                                    case 9:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Geonosian Brood Alpha\n" +
                                                "OTHERS    -> Sun Fac --- Poggle The Lesser --- Geonosian Soldier --- Geonosian Spy\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Any Sith or Empire\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Chief Nebit\n" +
                                                "OTHERS    -> Any Jawa\n" +
                                                "NOTES     -> Minimum Gear 10 recommended. Avoid using against high DMG Geonosians\n\n");
                                        break;

                                    case 10:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8\n" +
                                                "OPTIONALS -> Resistance Trooper --- Rey (Scavenger) --- Finn --- R2-D2 --- C34 --- Amilyn Holdo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Mother Talzin\n" +
                                                "OTHERS    -> Asajj Ventress --- Old Daka --- Nightsister Zombie\n" +
                                                "OPTIONALS -> Any Nightsister\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Darth Traya\n" +
                                                "OTHERS    -> Darth Sion --- Darth Nihilus\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Colonel Starck --- Snowtrooper\n" +
                                                "OPTIONALS -> Any Imperial Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Geonosian Brood Alpha\n" +
                                                "OTHERS    -> Remaining Geonosians\n\n");
                                        break;

                                    case 11:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Colonel Starck --- Range Trooper --- Snowtrooper\n" +
                                                "OPTIONALS -> Shoretrooper --- Death Trooper --- Stormtrooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> CT-7567 \"Rex\"\n" +
                                                "OTHERS    -> Wampa\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Jedi Training Rey\n" +
                                                "OTHERS    -> BB-8 --- Resistance Trooper\n" +
                                                "OPTIONALS -> Any Resistance\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Commander Luke Skywalker\n" +
                                                "OTHERS    -> Han Solo --- Chewbacca\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Enfys Nest\n" +
                                                "NOTES     -> Nest needs high tenacity\n\n");
                                        break;

                                    case 12:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Shaak Ti\n" +
                                                "OTHERS    -> CC-2224 \"Cody\" --- CT-7567 \"Rex\" --- CT-5555 \"Fives\" --- CT-21-0408 \"Echo\"\n" +
                                                "NOTES     -> Cody can be replaced with Clone Sergeant - Phase 1\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Enfys Nest\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Any Sith or Empire\n\n");
                                        break;

                                    default:
                                        System.out.print("\n\nInvalid choise! Try again.\n");
                                }

                                team = 0;
                                count4 = 1;
                            }
                            else{
                                System.out.print("\nInvalid choise! Try again.\n");
                                count4 = 0;
                            }
                        }

                        count1 = 1;
                        break;

                    case 3:
                        while(count5!=1){
                            System.out.print("\nTier 3 Teams List:\n" +
                                    "1 - Ewoks\n" +
                                    "2 - Phoenix\n" +
                                    "3 - Rogue One\n" +
                                    "Find out counters for team: ");
                            Scanner sc20 = new Scanner(System.in);
                            team = sc20.nextInt();

                            if(team==1 || team==2 || team==3){

                                switch(team){
                                    case 1:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Chief Chirpa\n" +
                                                "OTHERS    -> Ewok Elder --- Logray --- Wicket --- Paploo\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Enfys Nest\n" +
                                                "NOTES     -> Nest needs tenacity to prevent Logray's daze. Add Qi'ra lead for extra firepower\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Kylo Ren (Unmasked)\n" +
                                                "OTHERS    -> Kylo Ren --- First Order Executioner\n" +
                                                "OPTIONALS -> Any First Order\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Colonel Starck --- Snowtrooper\n" +
                                                "OPTIONALS -> Any Imperial Trooper\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Any Sith or Empire\n\n");
                                        break;

                                    case 2:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Hera Syndulla\n" +
                                                "OTHERS    -> Kanan Jarrus --- Garazeb \"Zeb\" Orrelios\n" +
                                                "OPTIONALS -> Sabine Wren --- Chopper --- Ezra Bridger\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> Wampa\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Enfys Nest\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> Chief Chirpa\n" +
                                                "OTHERS    -> Any Ewok\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 4\n");
                                        System.out.print("LEADER    -> Emperor Palpatine\n" +
                                                "OTHERS    -> Darth Vader\n" +
                                                "OPTIONALS -> Any Sith or Empire\n\n");
                                        break;

                                    case 3:
                                        System.out.print("\nENEMY\n");
                                        System.out.print("LEADER    -> Jyn Erso\n" +
                                                "OTHERS    -> Cassian Andor --- K-2SO\n" +
                                                "OPTIONALS -> Baze Malbus --- Chirrut Imwe --- Scarif Rebel Pathfinder --- Bistan --- Pao\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 1\n");
                                        System.out.print("LEADER    -> CT-7567 \"Rex\"\n" +
                                                "OTHERS    -> Wampa\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 2\n");
                                        System.out.print("LEADER    -> Enfys Nest\n" +
                                                "NOTES     -> Nest needs high tenacity\n\n");
                                        System.out.println("---------------------------------------------------------------------");
                                        System.out.print("\nCOUNTER 3\n");
                                        System.out.print("LEADER    -> General Veers\n" +
                                                "OTHERS    -> Range Trooper --- Snowtrooper\n" +
                                                "OPTIONALS -> Any Imperial Trooper\n" +
                                                "NOTES     -> Use speed mods\n\n");
                                        break;

                                    default:
                                        System.out.print("\n\nInvalid choise! Try again.\n");
                                }

                                team = 0;
                                count5 = 1;
                            }
                            else{
                                System.out.print("\nInvalid choise! Try again.\n");
                                count5 = 0;
                            }
                        }

                        count1 = 1;
                        break;

                    default:
                        System.out.print("\nInvalid choise! Try again.\n");
                        count1 = 0;
                        break;
                }
            }
            else{
                System.out.print("\nInvalid choise! Try again.\n");
                count1 = 0;
            }
        }
    }
}
