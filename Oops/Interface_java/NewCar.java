
package pack.Interface_java;

public class NewCar{
private Engine engine;
private Media cd  = new player();
public NewCar(){
    engine  = new PowerEngine();
}
public NewCar(Engine engine) {
    this.engine = engine;
}
public void start(){
    engine.start();
}
public void stop(){
    engine.stop();
}
public void Startmusic(){
    cd.start();
}
}