package _14_type_info._04_register_factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/31 14:01
 * Registering Class Factories in the base class.
 **/

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories =
            new ArrayList<>();
    static {
        //Collections.addAll() gives an "unchecked generic
        //array creation... for var_args parameter" warning
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    //Create a Class Factory for each specific type:
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    //Create a Class Factory for each specific type:
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
class CabinAirFilter extends Filter {
    //Create a Class Factory for each specific type:
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
class OilFilter extends Filter {
    //Create a Class Factory for each specific type:
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part{}

class FanBelt extends Belt {
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
class GeneratorBelt extends Belt {
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
class PowerSteeringBelt extends Belt {
    public static class Factory
            implements _14_type_info._04_register_factorymethod.Factory<PowerSteeringBelt> {

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFctories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
