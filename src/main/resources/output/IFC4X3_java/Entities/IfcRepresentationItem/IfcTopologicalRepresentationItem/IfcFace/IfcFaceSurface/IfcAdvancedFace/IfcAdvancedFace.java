public class IfcAdvancedFace extends IfcFaceSurface {

    // === WHERE CLAUSES ===
    // ApplicableEdgeCurves : SIZEOF(QUERY (ElpFbnds <* QUERY (Bnds <* SELF\IfcFace.Bounds | 'IFC4X3_DEV_73740fe4.IFCEDGELOOP' IN TYPEOF(Bnds.Bound)) | NOT (SIZEOF (QUERY (Oe <* ElpFbnds.Bound\IfcEdgeLoop.EdgeList | NOT (SIZEOF (['IFC4X3_DEV_73740fe4.IFCLINE', 'IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCPOLYLINE', 'IFC4X3_DEV_73740fe4.IFCBSPLINECURVE'] * TYPEOF(Oe\IfcOrientedEdge.EdgeElement\IfcEdgeCurve.EdgeGeometry)) = 1 ) )) = 0 ))) = 0
    // ApplicableSurface : SIZEOF ( ['IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE', 'IFC4X3_DEV_73740fe4.IFCSWEPTSURFACE', 'IFC4X3_DEV_73740fe4.IFCBSPLINESURFACE'] * TYPEOF(SELF\IfcFaceSurface.FaceSurface)) = 1
    // RequiresEdgeCurve : SIZEOF(QUERY (ElpFbnds <* QUERY (Bnds <* SELF\IfcFace.Bounds | 'IFC4X3_DEV_73740fe4.IFCEDGELOOP' IN TYPEOF(Bnds.Bound)) | NOT (SIZEOF (QUERY (Oe <* ElpFbnds.Bound\IfcEdgeLoop.EdgeList | NOT('IFC4X3_DEV_73740fe4.IFCEDGECURVE' IN TYPEOF(Oe\IfcOrientedEdge.EdgeElement) ))) = 0 ))) = 0
}
