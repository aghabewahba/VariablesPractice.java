package day57_abstraction_polymorhism.abstract_class_vs_interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable,Cloneable {
    //interface can extend multiple other interface --interface support multi inheretance
}
