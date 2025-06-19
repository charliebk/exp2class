package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMapConversion extends IfcCoordinateOperation {

    public IfcLengthMeasure Eastings;
    public IfcLengthMeasure Northings;
    public IfcLengthMeasure OrthogonalHeight;
    public IfcReal XAxisAbscissa; // OPTIONAL
    public IfcReal XAxisOrdinate; // OPTIONAL
    public IfcReal Scale; // OPTIONAL
    // INVERSE attributes:
    // TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS);

    // SUPERTYPE OF:
    // - IfcMapConversionScaled SUBTYPE OF IfcCoordinateOperation

    // WHERE constraints:
    // TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS);
}
