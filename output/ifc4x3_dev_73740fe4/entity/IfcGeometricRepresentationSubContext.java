package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {

    public IfcGeometricRepresentationContext ParentContext;
    public IfcPositiveRatioMeasure TargetScale; // OPTIONAL
    public IfcGeometricProjectionEnum TargetView;
    public IfcLabel UserDefinedTargetView; // OPTIONAL
    // INVERSE attributes:
    // SELF\IfcGeometricRepresentationContext.WorldCoordinateSystem : IfcAxis2Placement := ParentContext.WorldCoordinateSystem;
    // SELF\IfcGeometricRepresentationContext.CoordinateSpaceDimension : IfcDimensionCount := ParentContext.CoordinateSpaceDimension;
    // SELF\IfcGeometricRepresentationContext.TrueNorth : IfcDirection := NVL(ParentContext.TrueNorth, IfcConvertDirectionInto2D(SELF\IfcGeometricRepresentationContext.WorldCoordinateSystem.P[2]));
    // SELF\IfcGeometricRepresentationContext.Precision : IfcReal := NVL(ParentContext.Precision,1.E-5);
    // INVERSE attributes:
    // NoCoordOperation : SIZEOF(SELF\IfcGeometricRepresentationContext.HasCoordinateOperation) = 0;
    // ParentNoSub : NOT('IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(ParentContext));
    // UserTargetProvided :  (TargetView <> IfcGeometricProjectionEnum.USERDEFINED) OR
    // ((TargetView =  IfcGeometricProjectionEnum.USERDEFINED) AND EXISTS(UserDefinedTargetView)) ;

    // WHERE constraints:
    // NoCoordOperation : SIZEOF(SELF\IfcGeometricRepresentationContext.HasCoordinateOperation) = 0;
    // ParentNoSub : NOT('IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(ParentContext));
    // UserTargetProvided :  (TargetView <> IfcGeometricProjectionEnum.USERDEFINED) OR
    // ((TargetView =  IfcGeometricProjectionEnum.USERDEFINED) AND EXISTS(UserDefinedTargetView)) ;
}
