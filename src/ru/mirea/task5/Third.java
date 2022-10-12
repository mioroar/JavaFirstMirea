package ru.mirea.task5;

public class Third {
    string background_image_path;
    string animation_images_path = "frame/";
    public static void main(String[] args){
    MeApp app = new MyApp();
    if(args.length == 1){
        app.set_background_image_path(args[0]);
    }
    else if (args.length ==2){
    app.set_background_image_path(args[0]);
    app.set_animation_images_path(args[1]);
    }
    }
}
