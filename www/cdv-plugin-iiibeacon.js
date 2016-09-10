var iiiBeacon = {
    getBeaconInfo: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'iiiBeacon',
            'getBeaconInfo',
            []
        );
    }
};
module.exports = iiiBeacon;
