public class IfcBoxedHalfSpace : IfcHalfSpaceSolid
{
    public IfcBoundingBox Enclosure { get; set; }

    // === WHERE CLAUSES ===
    // UnboundedSurface : NOT ('IFC4X3_DEV_73740fe4.IFCCURVEBOUNDEDPLANE' IN TYPEOF(SELF\IfcHalfSpaceSolid.BaseSurface))
}
