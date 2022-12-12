/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymaxremove;

class BattleManager 
{
    private StatsManager sm1,sm2,smTemp;
    private Creature a1,a2, first,second, attacker, defender;
    private Ability[] a1Abilities, a2Abilities;
    private UserInput ui;
    private String attackerName, defenderName;
   
  
    public BattleManager(Creature a, Creature b)
    {
       a1 = a;
       a2 = b;
       ui = new UserInput();
       
       sm1 = new StatsManager(a1);
       sm2 = new StatsManager(a2);
       determineOrder();
       sm1 = new StatsManager(first);
       sm2 = new StatsManager(second);
       a1Abilities = first.getAbility();
       a2Abilities = second.getAbility();
       fight();
      
    }
  
  	private void determineOrder()
    {
     if(sm1.getSpeed() > sm2.getSpeed())
      {
        first = a1;
       second = a2;
      }
      else if(sm1.getSpeed() < sm2.getSpeed())
      {
        first = a2;
        second = a1;
      } //if same speed
      else
      {
        int ran = (int)(Math.random() * 2 + 1);
        if(ran == 1)
        {
          first = a1;
          second = a2;
        }
        else
        {
          first = a2;
          second = a1;
        }  
          
      }
      
      
      attacker = first;
      attackerName = first.getName();
      defender = second;
      defenderName = second.getName();
      
    }
  
     public void fight()
     {
      
       
       while(sm1.getHP() > 0 && sm2.getHP() > 0)
       {
           aggieTurn(sm1,sm2);
           attacker = second;
           defender = first;
           if(sm1.getHP() <=0 || sm2.getHP() <= 0)
             break;
          
           attacker = first;
           defender = second;
          
       }
       if(sm1.getHP() <= 0)
            System.out.println(sm1.getName() + " lost");
          else if(sm2.getHP() <= 0)
            System.out.println(sm2.getName() + " lost");
         
       
     }
  
     public boolean getHit()
     {
       boolean hit = false;
       double dodge = 0;
       //attacker hit chance out of 100%
       double hitChance = (int)(100 * Math.random() + 1);
       if(attacker.getName().equals(first.getName()))
       {
         dodge = .40 * sm2.getSpeed();
         
       }
       else
       {
         dodge = .40 * sm1.getSpeed();
       }
       
       if(hitChance >= dodge)
         hit = true;
       System.out.println("****");
       System.out.println("hitChance: " + hitChance + " dodge: " + dodge);
       System.out.println("Hit :" + hit);
       System.out.println("****\n");
       
       return hit;
     }
  
  	 public int getDamage()
     {
        int damage = 0;
        int mitigate = 0;
        if(attacker.getName().equals(first.getName()))
        {
          damage = (int)(sm1.getAttack() * Math.random() + (sm1.getAttack()*.30));
          mitigate = (int)(sm2.getDefense() * Math.random() + 1);
          //attack damage - mitigation
          System.out.println("damage: " + damage + " mitigation: " + mitigate);
          damage = damage - mitigate;
          sm1.updateEnergy(25);
        }
       
       else
       {
          damage = (int)(sm2.getAttack() * Math.random() + (sm2.getAttack() * .30));
          mitigate = (int)(sm1.getDefense() * Math.random() + 1);
          //attack damage - mitigation
          System.out.println("damage: " + damage + " mitigation: " + mitigate);
          damage = damage - mitigate;
          sm2.updateEnergy(25);
       }
       if(damage < 5)
         damage = 5;
       
       System.out.println("Damage: " + damage);
       System.out.println();
       return damage;
     }
  

  
        public void aggieTurn(StatsManager atk, StatsManager def)
        {
          String m = "";
         int mv = 0;
        String type = "";

        System.out.println();
            System.out.println(atk.getName() + " What do you want to do?");
           System.out.println(" hp: " +atk.getHP() + " p2 hp: " + def.getHP());
           System.out.println("Your energy: " +atk.getEnergy());
           System.out.println("Attack: " +atk.getAttack() + " Defense: " +atk.getDefense() +
                            " Speed: " +atk.getSpeed());
          for(int c = 0; c < 4; c++)
          { 
            if(sm2.getName().equalsIgnoreCase(atk.getName()))
            {
              System.out.print("Ability " + (c+1) + ") ");
            System.out.println(a2Abilities[c].getName() + "(" + a2Abilities[c].getType()+")");
            }
            else
            {
            System.out.print("Ability " + (c+1) + ") ");
            System.out.println(a1Abilities[c].getName() + "(" + a1Abilities[c].getType()+")");
            }
          }
          m = ui.getMove(atk.getEnergy());    
        
          type = "";
         mv = Integer.parseInt(m);
         if(sm2.getName().equalsIgnoreCase(atk.getName()))
         {
            type = a2Abilities[mv-1].getType();
         }
         else
         {
           type = a1Abilities[mv-1].getType();
         }

 
            if(type.equalsIgnoreCase("attack"))
            {
                 
                 if(getHit())
                 {
                   int damage = getDamage();
                   def.updateHP(-1*damage);
                 }
            }
                else if(type.equalsIgnoreCase("buff attack"))
            {
            atk.setAttack((int)(atk.getAttack()*.20));
            }
            else if(type.equalsIgnoreCase("buff health"))
            {
            atk.updateHP(20);
            }
            else if(type.equalsIgnoreCase("buff defense"))
            {
              int defense = def.getDefense();
              int deduct = (int)(defense * .15);
             def.setDefense(-1*deduct);
            }
            else if(type.equalsIgnoreCase("buff speed"))
            {
            atk.setSpeed(20);
            }
            else if(type.equalsIgnoreCase("debuff attack"))
            {
              int attack = def.getAttack();
              System.out.println("debuff atk: original atk: " + attack);
              int deduct = (int)(attack*.15);              
             def.setAttack(-1*deduct);
              System.out.println("atk after debuff: " + def.getAttack());
            }
            else if(type.equalsIgnoreCase("debuff defense"))
            {
              int defense = def.getDefense();
              int deduct = (int)(defense*.15);
             def.setDefense(-1*deduct); 
            }
            else if(type.equalsIgnoreCase("debuff speed"))
            {
              int speed = def.getSpeed();
              int deduct = (int)(speed * .15);
             def.setSpeed(-1*deduct);
            }
            else if(type.equalsIgnoreCase("debuff turn"))
            {
              int miss = (int)( 100 * Math.random() + 1);
              System.out.println("miss: " + miss);
              if(miss <= 50)              
                 for(int c = 0; c < 2; c++)
                     aggieTurn(atk,def);
            }
             else if(type.equalsIgnoreCase("super attack"))
           {
            atk.updateEnergy(-100);
             int satk =atk.getAttack();
            atk.setAttack(satk);
              if(getHit())
                 {
                   int damage = getDamage();
                   def.updateHP(-1*damage);
                  atk.updateEnergy(-25);
                 }
            atk.setAttack(-1*satk);
              
           }
           else if(type.equalsIgnoreCase("super health"))
           {
             int hp =atk.getHP();
            atk.updateHP((int)(hp * 1.50 + .5));
            atk.updateEnergy(-100);
           }
            
        }
}

