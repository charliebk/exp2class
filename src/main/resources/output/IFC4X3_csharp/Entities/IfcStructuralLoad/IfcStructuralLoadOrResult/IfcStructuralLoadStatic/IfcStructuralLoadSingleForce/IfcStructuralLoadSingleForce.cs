public class IfcStructuralLoadSingleForce : IfcStructuralLoadStatic
{
    public IfcForceMeasure ForceX { get; set; }
    public IfcForceMeasure ForceY { get; set; }
    public IfcForceMeasure ForceZ { get; set; }
    public IfcTorqueMeasure MomentX { get; set; }
    public IfcTorqueMeasure MomentY { get; set; }
    public IfcTorqueMeasure MomentZ { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralLoadSingleForceWarping
}
