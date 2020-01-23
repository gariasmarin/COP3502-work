package edu.ufl.cise.cs1.controllers;
import java.util.*;
import game.controllers.AttackerController;
import game.models.Actor;
import game.models.Defender;
import game.models.Game;
import game.models.Node;

import java.util.List;

public final class StudentAttackerController implements AttackerController
{
	public void init(Game game) { }

	public void shutdown(Game game) { }

	public int update(Game game,long timeDue) {
		int defenderDist = 0;
		int[] closestDefender = new int[4];
		int defenderA = game.getDefender(0).getLocation().getPathDistance(game.getAttacker().getLocation());
		int defenderB = game.getDefender(1).getLocation().getPathDistance(game.getAttacker().getLocation()); // the four defenders's respective locations in the maze
		int defenderC = game.getDefender(2).getLocation().getPathDistance(game.getAttacker().getLocation());
		int defenderD = game.getDefender(3).getLocation().getPathDistance(game.getAttacker().getLocation());
		closestDefender [0] = defenderA;
		closestDefender [1] = defenderB;
		closestDefender [2] = defenderC;
		closestDefender [3] = defenderD;
		Arrays.sort(closestDefender); //sorts the defender's distances to show which is closest to the attacker
		Defender defender = null;
		int index = 0;
		while (closestDefender[index] == -1 && index < 3){ // this loop loops through the states of the defenders, whether they are in the center box or in the maze. If defender is in center box (-1), it will skip it and go to next closest defender.
			index++;
		}
		if (closestDefender[index] == defenderA){
			defender = game.getDefender(0);
			defenderDist = game.getAttacker().getNextDir(game.getDefender(0).getLocation(), false);
		}
		else if (closestDefender[index] == defenderB){
			defender = game.getDefender(1);
			defenderDist = game.getAttacker().getNextDir(game.getDefender(1).getLocation(), false);
		}
		else if(closestDefender[index] == defenderC){
			defender = game.getDefender(2); // variable that gives a defender value
			defenderDist = game.getAttacker().getNextDir(game.getDefender(2).getLocation(), false);
		}
		else if(closestDefender[index] == defenderD){
			defender = game.getDefender(3);
			defenderDist = game.getAttacker().getNextDir(game.getDefender(3).getLocation(), false);
		}
		int powPillAction = 1;
		int powPillDist = 50;
		if (game.getPowerPillList().size() != 0) { //assigns values to variables if there are power pills in the maze
			powPillAction = game.getAttacker().getNextDir(betterGetTarget(game.getPowerPillList(),game),true);
			powPillDist = game.getAttacker().getLocation().getPathDistance(betterGetTarget(game.getPowerPillList(), game));
		}

		if (closestDefender[index] <= 8 && !defender.isVulnerable() && closestDefender[index] != -1) { // determines whether defender is within 8 units, if it isn't vulnerable, and if it's in the maze at the same time.
			return defenderDist;
		}
		else if(defender.isVulnerable()){ // attacks defender if it's vulnerable
			return game.getAttacker().getNextDir(defender.getLocation(),true);
		}
		else if (powPillDist == 1){ //makes the attacker stay still at the pill and wait
			return game.getAttacker().getReverse();
		}
		else if (game.getPowerPillList().size() != 0){ // action that makes attacker go to power pill
			return powPillAction;
		}
		else{
			return game.getAttacker().getNextDir(betterGetTarget(game.getPillList(), game),true); // attacker chases regular pills.
		}
		}




		public static Node betterGetTarget(List<Node> node, Game game) { // this comes from Slack
		if (node.size() == 0) {
			return null;
		}
		int minDistance = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < node.size(); i++) {
			int currentDistance = node.get(i).getPathDistance(game.getAttacker().getLocation());
			if (currentDistance < minDistance) {
				minDistance = node.get(i).getPathDistance(game.getAttacker().getLocation());
				minIndex = i;
			}
		}
		return node.get(minIndex);
	}


	}