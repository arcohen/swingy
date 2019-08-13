/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author arcohen
 */
public class Hero extends Character {
    HeroClass heroClass;
    String name;
    int level;
    int xp;
    List<Artifact> artifacts;
    Map map;
}
  