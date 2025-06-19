package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelInterferesElements extends IfcRelConnects {

    public IfcInterferenceSelect RelatingElement;
    public IfcInterferenceSelect RelatedElement;
    public IfcConnectionGeometry InterferenceGeometry; // OPTIONAL
    public IfcIdentifier InterferenceType; // OPTIONAL
    public IfcLogical ImpliedOrder;
    public IfcSpatialZone InterferenceSpace; // OPTIONAL
    // INVERSE attributes:
    // NoSelfReference : RelatingElement :<>: RelatedElement;

    // WHERE constraints:
    // NoSelfReference : RelatingElement :<>: RelatedElement;
}
