# Write your MySQL query statement below
SELECT per.firstName, per.lastName, ad.city, ad.state
FROM Person AS per
LEFT JOIN Address AS ad
ON per.personId = ad.personId;