package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRigidOperation extends IfcCoordinateOperation {

    public IfcMeasureValue FirstCoordinate;
    public IfcMeasureValue SecondCoordinate;
    public IfcLengthMeasure Height; // OPTIONAL
    // INVERSE attributes:
    // SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)));

    // WHERE constraints:
    // SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)));
}
