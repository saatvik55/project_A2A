package hashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class hi2022 {
    static Scanner sc = new Scanner(System.in);
    static int contributors;
    static int projects;
    static String contributorsname;
    static int noofskill;
    static String skillname;
    static int skilllevel;
    static HashMap<String, Integer> skill = new HashMap<String, Integer>();
    static ArrayList<String> skillstr= new ArrayList<String>();
    static ArrayList<Integer> langstr= new ArrayList<Integer>();
    static String projectname;
    static int days, score, bestbefore, roles;
    static String language;
    static int languagelevel;
    static HashMap<String, Integer> lang = new HashMap<String, Integer>();
    static int totalproj = 0, scoreindex = 0;

   

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        contributors = sc.nextInt();
        projects = sc.nextInt();
        System.out.println(projects);
        for (int i = 0; i < contributors; i++) {
            contributorsname = sc.next();
            noofskill = sc.nextInt();
            for (int j = 0; j < noofskill; j++) {
                skillname = sc.next();
                skilllevel = sc.nextInt();
                skillstr.add(skillname);
                langstr.add(skilllevel);
                skill.put(skillname, skilllevel);

            }
        }
        for (int i = 0; i < projects; i++) {
            projectname = sc.next();
            System.out.println(projectname);
            days = sc.nextInt();
            score = sc.nextInt();
            bestbefore = sc.nextInt();
            roles = sc.nextInt();
            while (roles-- > 0) {
                language = sc.next();
                languagelevel = sc.nextInt();
                lang.put(language, languagelevel);
                checker(language, languagelevel);
            }

        }
    }

    static void checker(String language, int languagelevel) {
        // System.out.println(language+" "+skillname);
        if (skillstr.contains(language)) {
            if (Collections.max(langstr) >= languagelevel) {

                System.out.print(skill.get(skilllevel) + " ");
            }
            System.out.println();
        }

    }
}
