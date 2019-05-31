import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.*;
import javafx.scene.transform.Translate;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Timeline;


public class BrickBreakerGame extends Application {
  @Override
  public void start(Stage stage) {
    Pane canvas = new Pane();
    //Bounds bounds = canvas.getBoundsInLocal();
    //draw ball
    Circle ball = new Circle(10, Color.RED);
    ball.setCenterX(450.0f);
    ball.setCenterY(615.0f);
    ball.setRadius(10.0f);
    ball.toFront();
    canvas.getChildren().add(ball);

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20),
       new EventHandler<ActionEvent>(){
         double dx = 10;
         double dy = 30;

         @Override
         public void handle(ActionEvent t) {
           ball.setLayoutX(ball.getLayoutX() + dx);
           ball.setLayoutY(ball.getLayoutY() + dy);
           Bounds bounds = canvas.getBoundsInLocal();
           if(ball.getLayoutX() <= (bounds.getMinX() + ball.getRadius()) || ball.getLayoutX() >= (bounds.getMaxX() - ball.getRadius())){
             dx = -dx;
           }
           if((ball.getLayoutY() >= (bounds.getMaxY() - ball.getRadius())) || (ball.getLayoutY() <= (bounds.getMinY() + ball.getRadius()))){
             dy = -dy;
            }
           }
         }));
         timeline.setCycleCount(Timeline.INDEFINITE);
         timeline.play();

  scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override public void handle(KeyEvent event) {
        switch (event.getCode()) {
          case RIGHT:
              base.setCenterX(base.getCenterX() + KEYBOARD_MOVEMENT_DELTA);
              base = character.getCenterX();
              break;
          case LEFT:
              character.setCenterX(character.getCenterX() - KEYBOARD_MOVEMENT_DELTA);
              characterY = character.getCenterY();
              break;
            }
          }
        });

    //brick 1, row 1
    Rectangle brick1 = new Rectangle();
    brick1.setX(150.0f);
    brick1.setY(25.0f);
    brick1.setWidth(100.0f);
    brick1.setHeight(50.0f);

    //brick 2, row 1
    Rectangle brick2 = new Rectangle();
    brick2.setX(300.0f);
    brick2.setY(25.0f);
    brick2.setWidth(100.0f);
    brick2.setHeight(50.0f);

    //brick 3, row 1
    Rectangle brick3 = new Rectangle();
    brick3.setX(450.0f);
    brick3.setY(25.0f);
    brick3.setWidth(100.0f);
    brick3.setHeight(50.0f);

    //brick 4, row 1
    Rectangle brick4 = new Rectangle();
    brick4.setX(600.0f);
    brick4.setY(25.0f);
    brick4.setWidth(100.0f);
    brick4.setHeight(50.0f);

    //brick 5, row 1
    Rectangle brick5 = new Rectangle();
    brick5.setX(750.0f);
    brick5.setY(25.0f);
    brick5.setWidth(100.0f);
    brick5.setHeight(50.0f);

    //brick 6, row 2
    Rectangle brick6 = new Rectangle();
    brick6.setX(215.0f);
    brick6.setY(125.0f);
    brick6.setWidth(100.0f);
    brick6.setHeight(50.0f);

    //brick 7, row 2
    Rectangle brick7 = new Rectangle();
    brick7.setX(365.0f);
    brick7.setY(125.0f);
    brick7.setWidth(100.0f);
    brick7.setHeight(50.0f);

    //brick 8, row 2
    Rectangle brick8 = new Rectangle();
    brick8.setX(515.0f);
    brick8.setY(125.0f);
    brick8.setWidth(100.0f);
    brick8.setHeight(50.0f);

    //brick 9, row 2
    Rectangle brick9 = new Rectangle();
    brick9.setX(665.0f);
    brick9.setY(125.0f);
    brick9.setWidth(100.0f);
    brick9.setHeight(50.0f);

    //brick 10, row 3
    Rectangle brick10 = new Rectangle();
    brick10.setX(300.0f);
    brick10.setY(225.0f);
    brick10.setWidth(100.0f);
    brick10.setHeight(50.0f);

    //brick 11, row 3
    Rectangle brick11 = new Rectangle();
    brick11.setX(450.0f);
    brick11.setY(225.0f);
    brick11.setWidth(100.0f);
    brick11.setHeight(50.0f);

    //brick 12, row 3
    Rectangle brick12 = new Rectangle();
    brick12.setX(600.0f);
    brick12.setY(225.0f);
    brick12.setWidth(100.0f);
    brick12.setHeight(50.0f);

    //brick 13, row 4
    Rectangle brick13 = new Rectangle();
    brick13.setX(375.0f);
    brick13.setY(325.0f);
    brick13.setWidth(100.0f);
    brick13.setHeight(50.0f);

    //brick 14, row 4
    Rectangle brick14 = new Rectangle();
    brick14.setX(525.0f);
    brick14.setY(325.0f);
    brick14.setWidth(100.0f);
    brick14.setHeight(50.0f);

    //brick 15, row 5
    Rectangle brick15 = new Rectangle();
    brick15.setX(455.0f);
    brick15.setY(425.0f);
    brick15.setWidth(100.0f);
    brick15.setHeight(50.0f);

    //base
    Rectangle base = new Rectangle();
    base.setX(450);
    base.setY(615);
    base.setWidth(100.0f);
    base.setHeight(10.0f);
    base.setFill(Color.RED);

    Translate translate = new Translate();
    translate.setX(5);
    translate.setY(0);

    //Adding transformation to circle2
    base.getTransforms().addAll(translate);

    // canvas.getChildren().addAll(brick1, brick2, brick3, brick4, brick5, brick6, brick7, brick8, brick9, brick10, brick11, brick12, brick13, brick14, brick15, base, ball);
    Scene scene = new Scene(canvas, 1000, 1000);
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String args[]){
    launch(args);
  }
}
