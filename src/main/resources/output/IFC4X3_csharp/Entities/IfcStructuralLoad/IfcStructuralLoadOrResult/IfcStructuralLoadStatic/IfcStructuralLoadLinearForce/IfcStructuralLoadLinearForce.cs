public class IfcStructuralLoadLinearForce : IfcStructuralLoadStatic
{
    public IfcLinearForceMeasure LinearForceX { get; set; }
    public IfcLinearForceMeasure LinearForceY { get; set; }
    public IfcLinearForceMeasure LinearForceZ { get; set; }
    public IfcLinearMomentMeasure LinearMomentX { get; set; }
    public IfcLinearMomentMeasure LinearMomentY { get; set; }
    public IfcLinearMomentMeasure LinearMomentZ { get; set; }
}
