public class IfcStructuralLoadSingleDisplacement : IfcStructuralLoadStatic
{
    public IfcLengthMeasure DisplacementX { get; set; }
    public IfcLengthMeasure DisplacementY { get; set; }
    public IfcLengthMeasure DisplacementZ { get; set; }
    public IfcPlaneAngleMeasure RotationalDisplacementRX { get; set; }
    public IfcPlaneAngleMeasure RotationalDisplacementRY { get; set; }
    public IfcPlaneAngleMeasure RotationalDisplacementRZ { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralLoadSingleDisplacementDistortion
}
