class IfcGrid extends IfcPositioningElement {
    constructor() {
        /** @type {UNIQUE IFCGRIDAXIS[]} */
        this.UAxes = null;
        /** @type {UNIQUE IFCGRIDAXIS[]} */
        this.VAxes = null;
        /** @type {UNIQUE IFCGRIDAXIS[]} */
        this.WAxes = null;
        /** @type {IFCGRIDTYPEENUM} */
        this.PredefinedType = null;
    }
}
