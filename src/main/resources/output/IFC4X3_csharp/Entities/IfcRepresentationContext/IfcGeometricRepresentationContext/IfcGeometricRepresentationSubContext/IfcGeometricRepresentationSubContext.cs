public class IfcGeometricRepresentationSubContext : IfcGeometricRepresentationContext
{
    public IfcGeometricRepresentationContext ParentContext { get; set; }
    public IfcPositiveRatioMeasure TargetScale { get; set; }
    public IfcGeometricProjectionEnum TargetView { get; set; }
    public IfcLabel UserDefinedTargetView { get; set; }

    // === WHERE CLAUSES ===
    // NoCoordOperation : SIZEOF(SELF\IfcGeometricRepresentationContext.HasCoordinateOperation) = 0
    // ParentNoSub : NOT('IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(ParentContext))
    // UserTargetProvided :  (TargetView <> IfcGeometricProjectionEnum.USERDEFINED) OR ((TargetView =  IfcGeometricProjectionEnum.USERDEFINED) AND EXISTS(UserDefinedTargetView))

    // === DERIVE CLAUSES ===
    // SELF\IfcGeometricRepresentationContext.WorldCoordinateSystem : IfcAxis2Placement := ParentContext.WorldCoordinateSystem
    // SELF\IfcGeometricRepresentationContext.CoordinateSpaceDimension : IfcDimensionCount := ParentContext.CoordinateSpaceDimension
    // SELF\IfcGeometricRepresentationContext.TrueNorth : IfcDirection := NVL(ParentContext.TrueNorth, IfcConvertDirectionInto2D(SELF\IfcGeometricRepresentationContext.WorldCoordinateSystem.P[2]))
    // SELF\IfcGeometricRepresentationContext.Precision : IfcReal := NVL(ParentContext.Precision,1.E-5)
}
