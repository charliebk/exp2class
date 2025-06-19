class IfcDistributionPort extends IfcPort {
    constructor() {
        /** @type {IFCFLOWDIRECTIONENUM} */
        this.FlowDirection = null;
        /** @type {IFCDISTRIBUTIONPORTTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCDISTRIBUTIONSYSTEMENUM} */
        this.SystemType = null;
    }
}
