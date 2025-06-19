class IfcGeometricCurveSet extends IfcGeometricSet {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // NoSurfaces : SIZEOF(QUERY(Temp <* SELF\IfcGeometricSet.Elements | 'IFC4X3_DEV_73740fe4.IFCSURFACE' IN TYPEOF(Temp))) = 0
}
