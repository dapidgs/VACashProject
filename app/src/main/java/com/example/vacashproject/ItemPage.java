package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vacashproject.item.GameItem;
import com.example.vacashproject.item.GameItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemPage extends AppCompatActivity {

    TextView backBtn, gameTypeTitle, gameNameView;
    ImageView gameImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());

        Intent fromHome = getIntent();
        HomePageItem game = (HomePageItem) fromHome.getSerializableExtra("game");
        gameTypeTitle = findViewById(R.id.gameTypeTitle);
        gameTypeTitle.setText(game.getGameType());

        gameNameView = findViewById(R.id.gameName);
        gameNameView.setText(game.getName());

        gameImageView = findViewById(R.id.gameImage);
        gameImageView.setImageResource(game.getImage());

        RecyclerView recyclerView = findViewById(R.id.gameItemList);

        List<GameItem> items = new ArrayList<>();
        if (game.getGameType().equals("Mobile") ) {

            if(game.getName().equals("Mobile Legends")) {
                items.add(new GameItem("MLBB 50 Diamonds", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena (MOBA) game developed and published by Moonton, a subsidiary of ByteDance. 50000F in Jaya Gaming will get you MLBB 50 Diamonds on Mobile Legends." ,"Jaya Gaming", 50000F, R.drawable.mlbb1));
                items.add(new GameItem("Starlight Pass", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena (MOBA) game developed and published by Moonton, a subsidiary of ByteDance. 10000F in Wongfeihung will get you Starlight Pass on Mobile Legends. " ,"Wongfeihung", 10000F, R.drawable.mlbb2));
                items.add(new GameItem("100 Diamonds", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena (MOBA) game developed and published by Moonton, a subsidiary of ByteDance. 80000F in Apollo Box will get you 100 Diamonds on Mobile Legends." ,"Apollo Box", 80000F, R.drawable.mlbb3));
                items.add(new GameItem("Premium Starlight", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena (MOBA) game developed and published by Moonton, a subsidiary of ByteDance. 95000F in PPTI 11 Store will get you Premium Starlight on Mobile Legends." ,"PPTI 11 Store", 95000F, R.drawable.mlbb4));
                items.add(new GameItem("One Diamond", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena (MOBA) game developed and published by Moonton, a subsidiary of ByteDance. 950F in Iseng Center will get you One Diamond on Mobile Legends. " ,"Iseng Center", 950F, R.drawable.mlbb_banner));

            } else if (game.getName().equals("Free Fire")) {

                items.add(new GameItem("Submachine Gun", "Free Fire is a battle royale game developed and published by Garena for Android and iOS. It became the most downloaded mobile game globally in 2019. 50000F in Jaya Gaming will get you Submachine Gun on Free Fire." ,"Jaya Gaming", 50000F, R.drawable.freefire1));

                items.add(new GameItem("Protective Gear", "Free Fire is a battle royale game developed and published by Garena for Android and iOS. It became the most downloaded mobile game globally in 2019. 10000F in Wongfeihung will get you Protective Gear on Free Fire. " ,"Wongfeihung", 10000F, R.drawable.freefire2));

                items.add(new GameItem("100 Diamonds", "Free Fire is a battle royale game developed and published by Garena for Android and iOS. It became the most downloaded mobile game globally in 2019. 90000F in Apollo Box will get you 100 Diamonds on Free Fire. " ,"Apollo Box", 80000F, R.drawable.freefire3));

                items.add(new GameItem("Premium Starlight", "Free Fire is a battle royale game developed and published by Garena for Android and iOS. It became the most downloaded mobile game globally in 2019. 95000F in PPTI 11 Store will get you Premium Starlight on Free Fire. " ,"PPTI 11 Store", 95000F, R.drawable.freefire4));

                items.add(new GameItem("One Diamond", "Free Fire is a battle royale game developed and published by Garena for Android and iOS. It became the most downloaded mobile game globally in 2019. 950F in Iseng Center will get you One Diamond on Free Fire." ,"Iseng Center", 950F, R.drawable.freefire5));

            } else if (game.getName().equals("CoD Mobile")) {

                items.add(new GameItem("Assault Riffle", "Call of Duty: Mobile is a free-to-play first-person shooter video game developed by TiMi Studio Group and published by Activision for Android and iOS. 4000F in Game Quest will get you Assault Riffle on CoD: Mobile. " ,"Game Quest", 4000F, R.drawable.cod_mobile1));
                items.add(new GameItem("Scorestreak", "Call of Duty: Mobile is a free-to-play first-person shooter video game developed by TiMi Studio Group and published by Activision for Android and iOS. 90000F in Virtual World Store will get you Scorestreak on CoD: Mobile." ,"Virtual World Store", 90000F, R.drawable.cod_mobile2));
                items.add(new GameItem("Perk", "Call of Duty: Mobile is a free-to-play first-person shooter video game developed by TiMi Studio Group and published by Activision for Android and iOS. 200000F in Game Galaxy will get you Perk on CoD: Mobile." ,"Game Galaxy", 200000F, R.drawable.cod_mobile3));
                items.add(new GameItem("Lethal Equipment", "Call of Duty: Mobile is a free-to-play first-person shooter video game developed by TiMi Studio Group and published by Activision for Android and iOS. 1000F in Level Up Games will get you Lethal Equipment on CoD: Mobile. " ,"Level Up Games", 1000F, R.drawable.cod_mobile4));
                items.add(new GameItem("Operator Skill", "Call of Duty: Mobile is a free-to-play first-person shooter video game developed by TiMi Studio Group and published by Activision for Android and iOS. 11111F in GameStop will get you Operator Skill on CoD: Mobile." ,"GameStop", 11111F, R.drawable.cod_mobile5));

            } else if (game.getName().equals("PUBG Mobile")) {

                items.add(new GameItem("Assault Rifle:M416", "PUBG Mobile is a free-to-play battle royale video game developed by LightSpeed & Quantum Studio, a division of Tencent Games. It is a mobile game adaptation of PUBG: Battlegrounds. It was initially released for Android and iOS on 19 March 2018. 5000F in Game Universe will get you Assault Rifle:M416 on PUBG Mobile." ,"Game Universe", 5000F, R.drawable.pubg1));
                items.add(new GameItem("Armor: Level 3 Vest", "PUBG Mobile is a free-to-play battle royale video game developed by LightSpeed & Quantum Studio, a division of Tencent Games. It is a mobile game adaptation of PUBG: Battlegrounds. It was initially released for Android and iOS on 19 March 2018. 3000F in Game Boulevard will get you Armor: Level 3 Vest on PUBG Mobile." ,"Game Boulevard", 3000F, R.drawable.pubg2));
                items.add(new GameItem("Healing Item: First Aid Kit", "PUBG Mobile is a free-to-play battle royale video game developed by LightSpeed & Quantum Studio, a division of Tencent Games. It is a mobile game adaptation of PUBG: Battlegrounds. It was initially released for Android and iOS on 19 March 2018. 500000F in Game Street will get you Healing Item:First Aid Kit on PUBG Mobile." ,"Game Street", 500000F, R.drawable.pubg3));
                items.add(new GameItem("Throwables: Frag Grenade", "PUBG Mobile is a free-to-play battle royale video game developed by LightSpeed & Quantum Studio, a division of Tencent Games. It is a mobile game adaptation of PUBG: Battlegrounds. It was initially released for Android and iOS on 19 March 2018. 33000F in Game Grid will get you Throwables: Frag Grenade on PUBG Mobile." ,"Game Grid", 33000F, R.drawable.pubg4));
                items.add(new GameItem("Attachments: 4x Scope", "PUBG Mobile is a free-to-play battle royale video game developed by LightSpeed & Quantum Studio, a division of Tencent Games. It is a mobile game adaptation of PUBG: Battlegrounds. It was initially released for Android and iOS on 19 March 2018. 12111F in Game Corner will get you Attachments: 4x Scope on PUBG Mobile." ,"Game Corner", 12111F, R.drawable.pubg5));


            } else if (game.getName().equals("Clash Royale")) {

                items.add(new GameItem("Troop Card", "Clash Royale is a free-to-play, pay-to-win, real-time strategy video game developed and published by Supercell. The game combines elements from collectible card games, tower defense, and multiplayer online battle arena. 7000F in Game Arcade will get you Troop Card on Clash Royale." ,"Game Arcade", 7000F, R.drawable.clash_royale1));

                items.add(new GameItem("Spell Card", "Clash Royale is a free-to-play, pay-to-win, real-time strategy video game developed and published by Supercell. The game combines elements from collectible card games, tower defense, and multiplayer online battle arena. 13000F in Game Wave will get you Spell Card on Clash Royale." ,"Game Wave", 13000F, R.drawable.clash_royale2));

                items.add(new GameItem("Building Card", "Clash Royale is a free-to-play, pay-to-win, real-time strategy video game developed and published by Supercell. The game combines elements from collectible card games, tower defense, and multiplayer online battle arena. 50000F in Game Gallery will get you Building Card on Clash Royale." ,"Game Gallery", 50000F, R.drawable.clash_royale3));

                items.add(new GameItem("Spell Building Card", "Clash Royale is a free-to-play, pay-to-win, real-time strategy video game developed and published by Supercell. The game combines elements from collectible card games, tower defense, and multiplayer online battle arena. 12000F in Game Pavillion will get you Spell Building Card on Clash Royale." ,"Game Pavillion", 12000F, R.drawable.clash_royale4));

                items.add(new GameItem("AoE Spell Card", "Clash Royale is a free-to-play, pay-to-win, real-time strategy video game developed and published by Supercell. The game combines elements from collectible card games, tower defense, and multiplayer online battle arena. 9000F in Game Trail will get you AoE Spell Card on Clash Royale." ,"Game Trail", 9000F, R.drawable.clash_royale5));

            }
        }
        else if (game.getGameType().equals("PC")) {
            switch (game.getName()) {
                case "Valorant":

                    items.add(new GameItem("Agent Abilities", "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games, for Windows. Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics in Counter-Strike. 40000F in Game Street will get you Agent Abilities on Valorant.", "Game Street", 40000F, R.drawable.valorant1));

                    items.add(new GameItem("Weapons", "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games, for Windows. Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics in Counter-Strike. 90000F in Game Grid will get you Weapons on Valorant.", "Game Grid", 90000F, R.drawable.valorant2));

                    items.add(new GameItem("Abilities", "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games, for Windows. Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics in Counter-Strike. 100000F in Game Corner will get you Abilities on Valorant.", "Game Corner", 100000F, R.drawable.valorant3));

                    items.add(new GameItem("Ultimate Abilities", "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games, for Windows. Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics in Counter-Strike. 11000F in Game Junction will get you Ultimate Abilities on Valorant.", "Game Junction", 11000F, R.drawable.valorant4));

                    items.add(new GameItem("Skins", "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games, for Windows. Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics in Counter-Strike. 2000F in Game Realm will get you Skins on Valorant.", "Game Realm", 2000F, R.drawable.valorant5));
                    break;
                case "Call of Duty":

                    items.add(new GameItem("Battle Pass", "Call of Duty is a video game series and media franchise published by Activision, starting in 2003. It was released on October 28, 2022. 30000F in Level Up Games will get you Battle Pass on Valorant.", "Level Up Games", 30000F, R.drawable.codpc1));

                    items.add(new GameItem("Cosmetics/Skins", "Call of Duty is a video game series and media franchise published by Activision, starting in 2003. It was released on October 28, 2022. 70000F in Game Galaxy will get you Cosmetics/Skins on Valorant.", "Game Galaxy", 70000F, R.drawable.codpc2));

                    items.add(new GameItem("Bundle/Retail Pack", "Call of Duty is a video game series and media franchise published by Activision, starting in 2003. It was released on October 28, 2022. 200000F in Game Oasis will get you Bundle/Retail Pack on Valorant.", "Game Oasis", 200000F, R.drawable.codpc3));

                    items.add(new GameItem("Currency/COD Points", "Call of Duty is a video game series and media franchise published by Activision, starting in 2003. It was released on October 28, 2022. 22000F in Game Emporium will get you Currency/COD Points on Valorant.", "Game Emporium", 22000F, R.drawable.codpc4));

                    items.add(new GameItem("Season Pass", "Call of Duty is a video game series and media franchise published by Activision, starting in 2003. It was released on October 28, 2022. 30000F in Game Paradise will get you Season Pass on Valorant.", "Game Paradise", 30000F, R.drawable.codpc5));
                    break;
                case "Far Cry":

                    items.add(new GameItem("Weapons", "Far Cry is an anthology franchise of first-person shooter games, all of which have been published by Ubisoft. The first game, Far Cry, was developed by Crytek to premiere their CryEngine software, and released in March 2004. 40000F in Game Wave will get you Weapons on Far Cry.", "Game Wave", 40000F, R.drawable.farcry1));

                    items.add(new GameItem("Upgrades", "Far Cry is an anthology franchise of first-person shooter games, all of which have been published by Ubisoft. The first game, Far Cry, was developed by Crytek to premiere their CryEngine software, and released in March 2004. 6000F in Game Galaxy will get you Upgrades on Far Cry.", "Game Galaxy", 6000F, R.drawable.farcry2));

                    items.add(new GameItem("Vehicles", "Far Cry is an anthology franchise of first-person shooter games, all of which have been published by Ubisoft. The first game, Far Cry, was developed by Crytek to premiere their CryEngine software, and released in March 2004. 20000F in Game Oasis will get you Vehicles on Far Cry.", "Game Oasis", 20000F, R.drawable.farcry3));

                    items.add(new GameItem("Skins/Cosmetics", "Far Cry is an anthology franchise of first-person shooter games, all of which have been published by Ubisoft. The first game, Far Cry, was developed by Crytek to premiere their CryEngine software, and released in March 2004. 2000F in Game Emporium will get you Skins/Cosmetics on Far Cry.", "Game Emporium", 2000F, R.drawable.farcry4));

                    items.add(new GameItem("Consumables/Items", "Far Cry is an anthology franchise of first-person shooter games, all of which have been published by Ubisoft. The first game, Far Cry, was developed by Crytek to premiere their CryEngine software, and released in March 2004. 40000F in Game Landmark will get you Consumables/Items on Far Cry.", "Game Landmark", 40000F, R.drawable.farcry5));
                    break;
                case "Resident Evil":

                    items.add(new GameItem("Weapons", "Resident Evil, or Biohazard[a] in Japan and Southeast Asia, is a Japanese horror game media franchise created by Capcom. It is the highest-grossing horror franchise. 30000F in Game Wave will get you Weapons on Resident Evil.", "Game Wave", 30000F, R.drawable.residentevil1));

                    items.add(new GameItem("Healing Items", "Resident Evil, or Biohazard[a] in Japan and Southeast Asia, is a Japanese horror game media franchise created by Capcom. It is the highest-grossing horror franchise. 4000F in Game Galaxy will get you Healing Items on Resident Evil.", "Game Galaxy", 4000F, R.drawable.residentevil2));

                    items.add(new GameItem("Keys", "Resident Evil, or Biohazard[a] in Japan and Southeast Asia, is a Japanese horror game media franchise created by Capcom. It is the highest-grossing horror franchise. 20000F in Game Oasis will get you Keys on Resident Evil.", "Game Oasis", 20000F, R.drawable.residentevil3));

                    items.add(new GameItem("Puzzle Items", "Resident Evil, or Biohazard[a] in Japan and Southeast Asia, is a Japanese horror game media franchise created by Capcom. It is the highest-grossing horror franchise. 2000F in Game Emporium will get you Puzzle Items on Resident Evil.", "Game Emporium", 2000F, R.drawable.residentevil4));

                    items.add(new GameItem("Ammo", "Resident Evil, or Biohazard[a] in Japan and Southeast Asia, is a Japanese horror game media franchise created by Capcom. It is the highest-grossing horror franchise. 10000F in Game Landmark will get you Ammo on Resident Evil.", "Game Landmark", 10000F, R.drawable.residentevil5));
                    break;
                case "Roblox":

                    items.add(new GameItem("Avatar Clothing", "Roblox is an online game platform and game creation system developed by Roblox Corporation that allows users to program games and play games created by other users. 3000F in Game David will get you Avathar Clothing on Roblox.", "Game David", 3000F, R.drawable.roblox1));

                    items.add(new GameItem("Game Passes", "Roblox is an online game platform and game creation system developed by Roblox Corporation that allows users to program games and play games created by other users. 80000F in Game Antonk will get you Game Passes on Roblox.", "Game Antonk", 80000F, R.drawable.roblox2));

                    items.add(new GameItem("Avatar Animation", "Roblox is an online game platform and game creation system developed by Roblox Corporation that allows users to program games and play games created by other users. 10000F in Game Hyou will get you Avatar Animation on Roblox.", "Game Hyou", 100000F, R.drawable.roblox3));

                    items.add(new GameItem("Virtual Currency", "Roblox is an online game platform and game creation system developed by Roblox Corporation that allows users to program games and play games created by other users. 4000F in Game Junction will get you Virtual Currency on Roblox.", "Game Junction", 4000F, R.drawable.roblox4));

                    items.add(new GameItem("Virtual Items in Games", "Roblox is an online game platform and game creation system developed by Roblox Corporation that allows users to program games and play games created by other users. 1000F in Game Realm will get you Virtual Items in Games on Roblox.", "Game Realm", 1000F, R.drawable.roblox5));
                    break;
            }

        }

        else if (game.getGameType().equals("Console")) {
            if (game.getName().equals("Minecraft")) {

                items.add(new GameItem("Wood", "Minecraft is a 2011 sandbox game developed by Mojang Studios. The game was created by Markus \"Notch\" Persson in the Java programming language. 30000F in Game Street will get you Wood on Minecraft." ,"Game Street", 30000F, R.drawable.minecraft1));

                items.add(new GameItem("Stone", "Minecraft is a 2011 sandbox game developed by Mojang Studios. The game was created by Markus \"Notch\" Persson in the Java programming language. 1000F in Game Grid will get you Stone on Minecraft." ,"Game Grid", 1000F, R.drawable.minecraft2));
                items.add(new GameItem("Diamond", "Minecraft is a 2011 sandbox game developed by Mojang Studios. The game was created by Markus \"Notch\" Persson in the Java programming language. 20000F in Game Corner will get you Diamond on Minecraft." ,"Game Corner", 20000F, R.drawable.minecraft3));

                items.add(new GameItem("Iron Ingot", "Minecraft is a 2011 sandbox game developed by Mojang Studios. The game was created by Markus \"Notch\" Persson in the Java programming language. 13000F in Game Junction will get you Iron Ingot on Minecraft." ,"Game Junction", 13000F,R.drawable.minecraft4));

                items.add(new GameItem("Redstone", "Minecraft is a 2011 sandbox game developed by Mojang Studios. The game was created by Markus \"Notch\" Persson in the Java programming language. 55000F in Game Realm will get you Redstone on Minecraft." ,"Game Realm", 55000F, R.drawable.minecraft5));
            }
            else if (game.getName().equals("Mario Bros")) {

                items.add(new GameItem("Super Mushroom", "Super Mario Bros. is a video game made by Nintendo in 1985. It is played on the Nintendo Entertainment System (NES). The game is the sequel to the game Mario Bros. In Super Mario Bros., Mario goes in the Mushroom Kingdom. 300000F in Game Street will get you Super Mushroom on Mario Bros." ,"Game Street", 300000F, R.drawable.mario_bros1));

                items.add(new GameItem("Fire Flower", "Super Mario Bros. is a video game made by Nintendo in 1985. It is played on the Nintendo Entertainment System (NES). The game is the sequel to the game Mario Bros. In Super Mario Bros., Mario goes in the Mushroom Kingdom. 200000F in Game Grid will get you Fire Flower on Mario Bros." ,"Game Grid", 200000F, R.drawable.mario_bros2));

                items.add(new GameItem("Starman", "Super Mario Bros. is a video game made by Nintendo in 1985. It is played on the Nintendo Entertainment System (NES). The game is the sequel to the game Mario Bros. In Super Mario Bros., Mario goes in the Mushroom Kingdom. 400000F in Game Corner will get you Starman on Mario Bros." ,"Game Corner", 400000F, R.drawable.mario_bros3));

                items.add(new GameItem("Coin", "Super Mario Bros. is a video game made by Nintendo in 1985. It is played on the Nintendo Entertainment System (NES). The game is the sequel to the game Mario Bros. In Super Mario Bros., Mario goes in the Mushroom Kingdom. 10000F in Game Junction will get you Coin on Mario Bros." ,"Game Junction", 100000F, R.drawable.mario_bros4));

                items.add(new GameItem("1-Up Mushroom", "Super Mario Bros. is a video game made by Nintendo in 1985. It is played on the Nintendo Entertainment System (NES). The game is the sequel to the game Mario Bros. In Super Mario Bros., Mario goes in the Mushroom Kingdom. 500000F in Game Realm will get you 1-Up Mushroom on Mario Bros." ,"Game Realm", 500000F, R.drawable.mario_bros5));
            }

            else if (game.getName().equals("Overwatch")) {

                items.add(new GameItem("Hero", "Overwatch was a 2016 team-based multiplayer first-person shooter game by Blizzard Entertainment. Cross-platform play was supported across all platforms. 20000F in Game Street will get you Hero on Overwatch." ,"Game Street", 20000F, R.drawable.overwatch1));

                items.add(new GameItem("Ability", "Overwatch was a 2016 team-based multiplayer first-person shooter game by Blizzard Entertainment. Cross-platform play was supported across all platforms. 10000F in Game Grid will get you Ability on Overwatch." ,"Game Grid", 10000F, R.drawable.overwatch2));

                items.add(new GameItem("Ultimate", "Overwatch was a 2016 team-based multiplayer first-person shooter game by Blizzard Entertainment. Cross-platform play was supported across all platforms. 50000F in Game Corner will get you Ultimate on Overwatch." ,"Game Corner", 50000F, R.drawable.overwatch3));

                items.add(new GameItem("Mate", "Overwatch was a 2016 team-based multiplayer first-person shooter game by Blizzard Entertainment. Cross-platform play was supported across all platforms. 60000F in Game Junction will get you Mate on Overwatch." ,"Game Junction", 60000F, R.drawable.overwatch4));

                items.add(new GameItem("Team Work", "Overwatch was a 2016 team-based multiplayer first-person shooter game by Blizzard Entertainment. Cross-platform play was supported across all platforms. 10000F in Game Realm will get you Team Work on Overwatch." ,"Game Realm", 10000F, R.drawable.overwatch5));
            }

            else if (game.getName().equals("Apex Legends")) {

                items.add(new GameItem("Legend", "Apex Legends is a free-to-play battle royale-hero shooter game developed by Respawn Entertainment and published by Electronic Arts. 10000F in Game Street will get you Legend on Apex Legends." ,"Game Street", 10000F, R.drawable.apex1));

                items.add(new GameItem("Weapon", "Apex Legends is a free-to-play battle royale-hero shooter game developed by Respawn Entertainment and published by Electronic Arts. 30000F in Game Grid will get you Weapon on Apex Legends." ,"Game Grid", 30000F, R.drawable.apex2));

                items.add(new GameItem("Ability", "Apex Legends is a free-to-play battle royale-hero shooter game developed by Respawn Entertainment and published by Electronic Arts. 60000F in Game Corner will get you Ability on Apex Legends." ,"Game Corner", 60000F, R.drawable.apex3));

                items.add(new GameItem("Map", "Apex Legends is a free-to-play battle royale-hero shooter game developed by Respawn Entertainment and published by Electronic Arts. 10000F in Game Junction will get you Map on Apex Legends." ,"Game Junction", 10000F, R.drawable.apex4));

                items.add(new GameItem("Squad-based Gameplay", "Apex Legends is a free-to-play battle royale-hero shooter game developed by Respawn Entertainment and published by Electronic Arts. 20000F in Game Realm will get you Squad-based Gameplay on Apex Legends." ,"Game Realm", 20000F, R.drawable.apex5));
            }

            else if (game.getName().equals("Fortnite")) {
                items.add(new GameItem("Weapons", "Fortnite is an online video game developed by Epic Games and released in 2017. Fortnite as a whole generated $9 billion in gross revenue up until December 2019. 40000F in Game Street will get you Weapons on Fortnite." ,"Game Street", 40000F, R.drawable.fortnite1));
                items.add(new GameItem("Consumables", "Fortnite is an online video game developed by Epic Games and released in 2017. Fortnite as a whole generated $9 billion in gross revenue up until December 2019. 20000F in Game Grid will get you Consumables on Fortnite." ,"Game Grid", 20000F, R.drawable.fortnite2));
                items.add(new GameItem("Building Materials", "Fortnite is an online video game developed by Epic Games and released in 2017. Fortnite as a whole generated $9 billion in gross revenue up until December 2019. 30000F in Game Corner will get you Building Materials on Fortnite." ,"Game Corner", 30000F, R.drawable.fortnite3));
                items.add(new GameItem("Traps", "Fortnite is an online video game developed by Epic Games and released in 2017. Fortnite as a whole generated $9 billion in gross revenue up until December 2019. 10000F in Game Junction will get you Traps on Fortnite." ,"Game Junction", 10000F, R.drawable.fortnite4));
                items.add(new GameItem("Cosmetics/Skins", "Fortnite is an online video game developed by Epic Games and released in 2017. Fortnite as a whole generated $9 billion in gross revenue up until December 2019. 20000F in Game Realm will get you Cosmetics/Skins on Fortnite." ,"Game Realm", 20000F, R.drawable.fortnite5));
            }

        }


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new GameItemAdapter(getApplicationContext(), items));
    }

}