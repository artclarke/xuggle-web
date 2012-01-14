package controllers;

import play.mvc.*;

public class Xuggler extends Controller {

    public static void index() {
      render();
    }
    public static void downloads() {
      render();
    }
    public static void licensing() {
      render();
    }
    public static void tutorials() {
      redirect("http://wiki.xuggle.com/Tutorials");
    }
    public static void faq() {
      redirect("http://wiki.xuggle.com/Frequently_Asked_Questions");
    }
    public static void demos() {
      render();
    }

    public static void documentation() {
      render();
    }
    public static void codingstandards() {
      render();
    }
    public static void support() {
      render();
    }
    public static void status() {
      render();
    }
    public static void red5() {
      render();
    }
    public static void contributor() {
      render();
    }
    public static void build() {
      render();
    }
    public static void advbuild() {
      render();
    }
}
