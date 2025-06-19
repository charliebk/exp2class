class IfcSurfaceStyle extends IfcPresentationStyle {
    constructor() {
        /** @type {IFCSURFACESIDE} */
        this.Side = null;
        /** @type {SET [1:5] OF IFCSURFACESTYLEELEMENTSELECT} */
        this.Styles = null;
    }

    // === WHERE CLAUSES ===
    // MaxOneExtDefined : SIZEOF(QUERY(Style <* SELF.Styles | 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDSURFACESTYLE' IN TYPEOF(Style) )) <= 1
    // MaxOneLighting : SIZEOF(QUERY(Style <* SELF.Styles | 'IFC4X3_DEV_73740fe4.IFCSURFACESTYLELIGHTING' IN TYPEOF(Style) )) <= 1
    // MaxOneRefraction : SIZEOF(QUERY(Style <* SELF.Styles | 'IFC4X3_DEV_73740fe4.IFCSURFACESTYLEREFRACTION' IN TYPEOF(Style) )) <= 1
    // MaxOneShading : SIZEOF(QUERY(Style <* SELF.Styles | 'IFC4X3_DEV_73740fe4.IFCSURFACESTYLESHADING' IN TYPEOF(Style) )) <= 1
    // MaxOneTextures : SIZEOF(QUERY(Style <* SELF.Styles | 'IFC4X3_DEV_73740fe4.IFCSURFACESTYLEWITHTEXTURES' IN TYPEOF(Style) )) <= 1
}
