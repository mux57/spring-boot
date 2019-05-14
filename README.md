# spring-boot
Learning Springboot
mysql database schema

@Model
class Topic{
  private int id;
  private String name;
  private String description;
}

@Model
class Course {
private int id;
private String name;
private String description;
prvate Topic topic;
}


@Controller -> Topic
GET {url}/topics
GET {url}/topics/{id}
POST {url}/topics
PUT {url}/topics/{id}
DELETE {url}/topics/{id}

@Controller -> Course
GET {url}/topics/{id}/courses
GET {url}/topics/{id}/courses/{courseId}
POST {url}/topics/{id}/courses/
PUT {url}/topics/{id}/courses/{courseId}
DELETE {url}/topics/{id}/courses/{courseId}
