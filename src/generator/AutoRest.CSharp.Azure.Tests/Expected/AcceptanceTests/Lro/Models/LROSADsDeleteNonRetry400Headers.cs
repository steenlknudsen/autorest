// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsLro.Models
{
    using System.Linq;

    /// <summary>
    /// Defines headers for deleteNonRetry400 operation.
    /// </summary>
    public partial class LROSADsDeleteNonRetry400Headers
    {
        /// <summary>
        /// Initializes a new instance of the LROSADsDeleteNonRetry400Headers
        /// class.
        /// </summary>
        public LROSADsDeleteNonRetry400Headers() { }

        /// <summary>
        /// Initializes a new instance of the LROSADsDeleteNonRetry400Headers
        /// class.
        /// </summary>
        /// <param name="location">Location to poll for result status: will be
        /// set to /lro/retryerror/delete/202/retry/200</param>
        /// <param name="retryAfter">Number of milliseconds until the next
        /// poll should be sent, will be set to zero</param>
        public LROSADsDeleteNonRetry400Headers(string location = default(string), int? retryAfter = default(int?))
        {
            Location = location;
            RetryAfter = retryAfter;
        }

        /// <summary>
        /// Gets or sets location to poll for result status: will be set to
        /// /lro/retryerror/delete/202/retry/200
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "Location")]
        public string Location { get; set; }

        /// <summary>
        /// Gets or sets number of milliseconds until the next poll should be
        /// sent, will be set to zero
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "Retry-After")]
        public int? RetryAfter { get; set; }

    }
}
